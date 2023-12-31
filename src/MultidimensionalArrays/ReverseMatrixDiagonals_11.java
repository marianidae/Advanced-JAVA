package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseMatrixDiagonals_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        int[][] matrix = new int[rows][];

        for (int r = 0; r < rows; r++) {
            int[] row = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[r] = row;
        }

        int startRow = rows - 1;
        int startCol = cols - 1;

        while (startRow >= 0) {
            int r = startRow;
            int c = startCol;
            while (c < cols && r >= 0) {
                System.out.print(matrix[r][c] + " ");
                c++;
                r--;
            }
            System.out.println();
            startCol--;
            if (startCol < 0) {
                startCol = 0;
                startRow--;
            }
        }

    }

    private static boolean isInRange(int i, int length) {
        return i >= 0 && i < length;
    }
}
