package Generics.GenericCountMethodString_05;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int n = Integer.parseInt(scanner.nextLine());
        Box<Double> box = new Box<>();
        int bound = n;
        for (int i = 0; i < bound; i++) {
            double s =Double.parseDouble(scanner.nextLine());
            box.add(s);
        }
        System.out.println(box.countGraterElements(Double.valueOf(scanner.nextLine())));
    }
}
