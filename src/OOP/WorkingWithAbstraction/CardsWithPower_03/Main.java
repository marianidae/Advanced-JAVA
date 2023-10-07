package OOP.WorkingWithAbstraction.CardsWithPower_03;

import OOP.WorkingWithAbstraction.CardRank_02.CardRanks;
import OOP.WorkingWithAbstraction.CardSuit_01.CardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardRanks cardRank = CardRanks.valueOf(scanner.nextLine());
        CardSuit cardSuit = CardSuit.valueOf(scanner.nextLine());
        int cardPower = cardRank.getPower() + cardSuit.getPower();

        System.out.printf("Card name: %s of %s; Card power: %d", cardRank, cardSuit, cardPower);
    }
}
