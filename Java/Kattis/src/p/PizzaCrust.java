package p;

import java.util.Scanner;

public class PizzaCrust {
    public static void main(String[] arg) {
        Scanner console = new Scanner(System.in);
        double r = console.nextDouble();
        double c = console.nextDouble();
        double c1 = Math.PI * Math.pow(r, 2);
        double c2 = Math.PI * Math.pow(r-c,2);
        System.out.printf("%.6f", (c2/c1)*100);

    }
}
