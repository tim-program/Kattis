package s;

import java.util.Scanner;

public class SumKindOfProblem {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int iter = console.nextInt();
        for(int i = 0;i<iter;i++){
            int k = console.nextInt();
            int n = console.nextInt();

            int sumOdd = 0,o=1,sumEven=0,e=2,sum=0;
            for(int j = 0;j<n;j++){
                sum+=j+1;
                sumOdd+=o;o+=2;
                sumEven+=e;e+=2;
            }
            System.out.println(k+" "+sum+" "+sumOdd+" "+sumEven);
        }
    }
}
