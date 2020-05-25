package e;

import java.util.Scanner;

public class EstimatingTheAreaOfACircle {
    public static void main(String[] arg) {
        Scanner console = new Scanner(System.in);
        while(true) {
            double r = console.nextDouble();
            double m = console.nextDouble();
            double c = console.nextDouble();
            if(r==0&&m==0&&c==0)System.exit(0);
            System.out.printf("%01.9f",Math.pow(r, 2)*Math.PI);
            System.out.println(" "+Math.pow((r*2),2)*(c/m));
        }
    }
}
