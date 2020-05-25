package f;

import java.util.Scanner;

public class FreeFood {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean[] freeFoodDays = new boolean[365];
        int events = console.nextInt();
        int numDays = 0;
        for(int i = 0;i<events;i++) {
            int startDate = console.nextInt();
            int endDate = console.nextInt();
            for(;startDate<=endDate;startDate++) {
                if(!freeFoodDays[startDate-1]) {
                    numDays++;
                    freeFoodDays[startDate-1]=true;
                }
            }
        }
        System.out.println(numDays);
    }
}
