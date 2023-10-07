package Retake_Exam;

import java.util.Scanner;

public class NavyBattle_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] teritory = new char[size][size];
        int row = -1;
        int col = -1;
        for (int i = 0; i < size; i++) {
            char[] singleRow = scanner.nextLine().toCharArray();
            for (int j = 0; j < size; j++) {
                teritory[i][j] = singleRow[j];
                if (teritory[i][j] == 'S') {
                    row = i;
                    col = j;
                }

            }

        }
        int mine = 0;
        int cruiser = 0;
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            teritory[row][col] = '-';
            if (command.equals("right") && col != size - 1) {
                col++;
            } else if (command.equals("left") && col != 0) {
                col--;
            } else if (command.equals("down") && row != size - 1) {
                row++;
            } else if (command.equals("up") && row != 0) {
                row--;
            }

            if (teritory[row][col] == '*') {
                teritory[row][col] = '-';
                mine++;
            }else if (teritory[row][col] == 'C'){
                teritory[row][col] = '-';
                cruiser++;
            }
            teritory[row][col] = 'S';

            if (cruiser >= 3) {
                System.out.println("Mission accomplished, U-9 has destroyed all battle cruisers of the enemy!");
                printTeritory(size, teritory, row, col);
                break;
            }

            if (mine >= 3) {
                System.out.printf("Mission failed, U-9 disappeared! Last known coordinates [%d, %d]!%n", row, col);
                printTeritory(size, teritory, row, col);
                break;
            }
            command = scanner.nextLine();
        }
    }




    private static void printTeritory(int size, char[][] teritory, int row, int col) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(teritory[i][j]);
            }
            System.out.println();
        }
    }
}


