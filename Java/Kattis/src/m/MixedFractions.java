package m;

import java.util.Scanner;

public class MixedFractions {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while(true) {
            int numerator = console.nextInt();
            int denominator = console.nextInt();
            if(numerator == denominator && numerator == 0) {
                break;
            }

            System.out.println((numerator/denominator)+" "+(numerator%denominator)+" / "+denominator);
        }
    }
}
