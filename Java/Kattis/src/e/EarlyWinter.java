package e;

import java.util.Scanner;

public class EarlyWinter {
    //incorrect

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int d = console.nextInt();
        int currentGap = -1;
        int currentEarliest = Integer.MAX_VALUE;
        int currentDays = 0;
        boolean didIt = false;
        for (int i = 0; i < n; i++) {
            currentDays = console.nextInt();
            if (currentDays <= d && i > currentGap
                    && currentDays <= currentEarliest) {
                didIt = true;
                currentGap = i;
                currentEarliest = currentDays;
            }
        }
        if (!didIt) {
            System.out.println("It had never snowed this early!");
        } else {
            System.out.printf("It hadn't snowed this early in %d years!",
                    currentGap);
        }
    }
}
