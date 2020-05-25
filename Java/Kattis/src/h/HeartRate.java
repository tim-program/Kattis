package h;

import java.util.Scanner;

public class HeartRate {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int iter = console.nextInt();
        for(int i = 0;i<iter;i++){
            double b = console.nextDouble(),p = console.nextDouble();

            double min = 60*(b-1)/p;
            System.out.printf("%.4f",min);
            double calc = 60*b/p;
            System.out.printf(" %.4f ",calc);
            double max = 60*(b+1)/p;
            System.out.printf("%.4f",max);
            System.out.println();
        }
    }
}
