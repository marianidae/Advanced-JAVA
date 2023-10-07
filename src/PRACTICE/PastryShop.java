package PRACTICE;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PastryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> liquids = new ArrayDeque<>();

         Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).forEach(liquids::offer);

        ArrayDeque<Integer> ingredients = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).forEach(ingredients::push);

        int countBiscuit = 0, countCake = 0, countPie = 0, countPastry = 0;

        while (!liquids.isEmpty() && !ingredients.isEmpty()) {
            int valueLiquids = liquids.poll();
            int valueIngredients = ingredients.pop();
            if (valueLiquids + valueIngredients == 25) {
                countBiscuit++;
            } else if (valueLiquids + valueIngredients == 50) {
                countCake++;
            } else if (valueLiquids + valueIngredients == 75) {
                countPastry++;
            } else if (valueLiquids + valueIngredients == 100) {
                countPie++;
            } else {
                ingredients.push(valueIngredients + 3);
            }
        }
        if (countBiscuit != 0 && countCake != 0 && countPie != 0 && countPastry != 0) {
            System.out.println("Great! You succeeded in cooking all the food!");
        } else {
            System.out.println("What a pity! You didn't have enough materials to cook everything.");
        }
        if (liquids.isEmpty()) {
            System.out.println("Liquids left: none");
        } else {
            System.out.printf("Liquids left: %s%n", liquids.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        }
        if (ingredients.isEmpty()) {
            System.out.println("Ingredients left: none");
        } else {
            System.out.printf("Ingredients left: %s%n", ingredients.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        }
        System.out.printf("Biscuit: %d%nCake: %d%nPie: %d%nPastry: %d%n", countBiscuit, countCake, countPie, countPastry);
        }

    }

