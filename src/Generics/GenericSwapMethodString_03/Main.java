package Generics.GenericSwapMethodString_03;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int n = Integer.parseInt(scanner.nextLine());
        Box<Integer> box = new Box<>();
        int bound = n;
        for (int i = 0; i < bound; i++) {
            Integer s = Integer.parseInt(scanner.nextLine());;
            box.add(s);
        }
        int[] indexes = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        box.swap(indexes[0],indexes[1]);
        System.out.println(box.toString());

    }
}
