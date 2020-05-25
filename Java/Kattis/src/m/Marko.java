package m;

import java.util.Scanner;

public class Marko {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        while(true) {
            int D = console.nextInt();
            long V = console.nextLong();
            if(D==0)break;
            double d3 = D*D*D - 6*V/Math.PI;
            double d = Math.pow(d3, 1/3.0);
            System.out.printf("%.9f\n", d);
        }

    }
}
