package Retake_Exam;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ClimbThePeaks_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> portionsStack = new ArrayDeque<>();
        ArrayDeque<Integer> staminaQueue = new ArrayDeque<>();

        String input = scanner.nextLine();

        Arrays.stream(input.split(", "))
                .map(Integer::parseInt)
                .forEach(portionsStack::push);

        input = scanner.nextLine();

        Arrays.stream(input.split(", "))
                .map(Integer::parseInt)
                .forEach(staminaQueue::offer);


        String peak1 = "", peak2 = "", peak3 = "", peak4 = "", peak5 = "";
        while (!portionsStack.isEmpty() && !staminaQueue.isEmpty()) {

                int valuePortion = portionsStack.pop();
                int valueStamina = staminaQueue.poll();

                if (valuePortion + valueStamina == 80) {
                    peak1 = "Vihren";
                }else if (valuePortion + valueStamina == 90) {
                    peak2 = "Kutelo";
                }else if (valuePortion + valueStamina == 100) {
                    peak3 = "Banski Suhodol";
                }else if (valuePortion + valueStamina == 60) {
                    peak4 = "Polezhan";
                }else if (valuePortion + valueStamina == 70){
                    peak5 = "Kamenitza";
                }


        }


        if (!peak1.equals("") && !peak2.equals("") && !peak3.equals("") && !peak4.equals("") && !peak5.equals("")){
            System.out.println("Alex did it! He climbed all top five Pirin peaks in one week -> @FIVEinAWEEK");
            System.out.printf("Conquered peaks:%n");
            System.out.printf("%s%n%s%n%s%n%s%n%s", peak1, peak2, peak3, peak4, peak5);
        }else {
            System.out.println("Alex failed! He has to organize his journey better next time -> @PIRINWINS");
        }
    }
}
