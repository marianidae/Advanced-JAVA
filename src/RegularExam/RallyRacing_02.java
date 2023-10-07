package RegularExam;

import java.util.Scanner;

public class RallyRacing_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int num = Integer.parseInt(scanner.nextLine());
        char[][] territory = new char[size][size];
        int row = -1;
        int cow = -1;
        for (int i = 0; i < size; i++) {
            char[] singleRow = scanner.nextLine().toCharArray();
            for (int j = 0; j < size; j++) {
                territory[i][j] = singleRow[j];
                if (territory[i][j] == 'T') {
                    row = i;
                    cow = j;
                }

            }

        }
        int km = 0;
        String command = scanner.nextLine();
        while (!command.equals("End")){
            territory[row][cow] = '.';
            if (command.equals("left") && cow != 0){
                cow--;
            }else if (command.equals("right") && cow != size - 1){
                cow++;
            }else if (command.equals("up") && row != 0){
                row--;
            }else if (command.equals("down") && row != size - 1){
                row++;
            }
            if (territory[row][cow] == '.') {
                km += 10;
            }
            if (territory[row][cow] == 'F') {
                System.out.printf("Racing car %d finished the stage!%n", num);
                System.out.printf("Distance covered %d km.%n", km);

            }
            command = scanner.nextLine();
        }
        printTerritory(size, territory, row, cow);
    }


    private static void printTerritory(int size, char[][] territory, int row, int col) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(territory[i][j]);
            }
            System.out.println();
        }
    }
}
