package d;

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int gd1 = console.nextInt(),
                gd2 = console.nextInt(),
                gd3 = console.nextInt(),
                gd4 = console.nextInt(),
                ed1 = console.nextInt(),
                ed2 = console.nextInt(),
                ed3 = console.nextInt(),
                ed4 = console.nextInt();
        int eSum = ed1+ed2+ed3+ed4;
        int gSum = gd1+gd2+gd3+gd4;
        if(eSum>gSum) {
            System.out.println("Emma");
        }else if(gSum>eSum) {
            System.out.println("Gunnar");
        }else {
            System.out.println("Tie");
        }
    }
}
