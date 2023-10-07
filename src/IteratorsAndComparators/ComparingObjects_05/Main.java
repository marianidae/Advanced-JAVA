package IteratorsAndComparators.ComparingObjects_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personInfo = new ArrayList<>();
        String input;

        while (!"END".equals(input = scanner.nextLine())) {
            String[] data = input.split("\\s+");
            String name = data[0];
            String town = data[2];
            int age = Integer.parseInt(data[1]);
            Person person = new Person(name, town, age);
            personInfo.add(person);
        }

        int n = Integer.parseInt(scanner.nextLine());
        Person findPerson = personInfo.get(n - 1);
        long equals = personInfo.stream().filter(e -> findPerson.compareTo(e) == 0).count();

        if (equals == 1) {
            System.out.println("No matches");
        } else {
            System.out.printf("%d %d %d", equals, personInfo.size() - equals, personInfo.size());
        }
    }
}
