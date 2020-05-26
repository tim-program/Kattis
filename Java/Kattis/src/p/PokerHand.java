package p;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class PokerHand {
    public static void main(String[] args) {
        HashSet set = new HashSet<Character>();
        Scanner console = new Scanner(System.in);
        int[] numCardsInHand = new int[132];
        for(int i = 0;i<5;i++) {
            char nextCard = console.next().charAt(0);
            numCardsInHand[((int)nextCard)-1]++;
        }
        Arrays.sort(numCardsInHand);
        System.out.println(numCardsInHand[131]);
    }
}
