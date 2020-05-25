package e;

import java.util.Scanner;

public class EulersNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double num = console.nextDouble();
        double e = calcE(num);
        System.out.println(e);
    }

    static double calcE(double num) {
        double eValue = 0;
        for(long i = 0;i<=num;i++) {
            eValue+= (1.0/getFactorial(i));
        }
        return eValue;
    }

    static int recurseFactorial(int n) {
        if(n==0)return 1;
        return n*recurseFactorial(n-1);
    }

    static double getFactorial(double n) {
        double total = 1;
        if(n == 0)return 1;
        for(int i = 1;i<=n;i++) {
            total*=i;
        }
        return total;
    }
}
