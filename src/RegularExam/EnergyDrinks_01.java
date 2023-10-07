package RegularExam;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class EnergyDrinks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> firstStack = new ArrayDeque<>();
        ArrayDeque<Integer> secondQueue = new ArrayDeque<>();


        String input = scanner.nextLine();

        Arrays.stream(input.split(", "))
                .map(Integer::parseInt)
                .forEach(firstStack::push);

        input = scanner.nextLine();

        Arrays.stream(input.split(", "))
                .map(Integer::parseInt)
                .forEach(secondQueue::offer);


        int caffeine = 0;
        while (!firstStack.isEmpty() && !secondQueue.isEmpty()) {
            int firstItem = firstStack.peek();
            int secondItem = secondQueue.getFirst();
            int result = firstItem * secondItem;
            if (caffeine < 300) {
                firstStack.remove();
                secondQueue.remove();
                caffeine += result;


            } else {
                firstStack.remove();
                secondQueue.offer(secondItem);
                secondQueue.remove();
                caffeine = caffeine - result - 30;


                if (caffeine >= 300) {

                    break;
                }
                if (caffeine < 0){
                    caffeine = 0;
                }
            }


            if (secondQueue.isEmpty()) {
                System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
                System.out.printf("Stamat is going to sleep with %d mg caffeine.", caffeine);
                break;
            }
            if (firstStack.isEmpty()) {


                System.out.printf("Drinks left: %d, %d%n",
                        secondQueue.peekFirst(), secondQueue.peekLast());

                System.out.printf("Stamat is going to sleep with %d mg caffeine.", caffeine);

            }
        }


    }
}
