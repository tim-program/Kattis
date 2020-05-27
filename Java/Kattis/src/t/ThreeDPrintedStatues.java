package t;

import java.util.Scanner;

public class ThreeDPrintedStatues {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numStatues = console.nextInt();
        int numDays = 0;
        if (numStatues == 1) {
            System.out.println(++numDays);
            System.exit(0);
        }
        int dayCopy = 1;

        do {
            dayCopy++;
        } while (Math.pow(2, dayCopy) < numStatues);
        dayCopy--;

        int numPrinters = (int) Math.pow(2, dayCopy);
        int i = 1;
        for (;; i++) {
            numStatues -= numPrinters;
            if (numStatues <= 0) {
                break;
            }
        }
        System.out.println((dayCopy + i));
    }
}
