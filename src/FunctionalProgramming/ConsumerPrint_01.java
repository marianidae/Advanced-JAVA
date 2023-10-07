package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerPrint_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        Consumer<String> consumer = n -> System.out.println(n);

//        for (String name : names) {
//            System.out.println(name);
//        }


        for (String name : names) {
            consumer.accept(name);
        }
//        names.stream().forEach(consumer);
    }
}
