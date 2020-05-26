package j;

import java.util.Scanner;

public class JobExpenses {
    public static void main(String[] args) {
        int expensesTotal = 0;
        Scanner console = new Scanner(System.in);
        int numCases = console.nextInt();

        while(numCases > 0){
            int current = console.nextInt();
            if(current<0){
                expensesTotal-=current;
            }
            numCases--;
        }

        System.out.println(expensesTotal);
    }
}
