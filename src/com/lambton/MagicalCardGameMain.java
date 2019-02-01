package com.lambton;
import java.util.Scanner;
public class MagicalCardGameMain {
    public static void main(String args[]) {
        MagicalCardGameModel magicalCardGameModel = new MagicalCardGameModel();
        System.out.println(" Card Game ..");
        String[][] cards = {{"A", "7", "6"}, {"5", "3", "K"}, {"1", "2", "3"}};
        System.out.println(" select one card from below");
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < cards.length; j++) {
                System.out.print(cards[i][j]);
                System.out.print(" , ");
            }
            System.out.println(" ");
        }
        magicalCardGameModel.setCardList(cards);
        Scanner scanner = new Scanner(System.in);
        String FirstShuffleColPos = scanner.nextLine();
        magicalCardGameModel.setFirstShuffleColPos(FirstShuffleColPos);
    }
}