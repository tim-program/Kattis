package t;

import java.util.Scanner;

public class TheAmazingHumanCannonball {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int cases = console.nextInt();
        for(int i = 0;i<cases;i++) {
            double v0 = console.nextDouble();
            double theta = console.nextDouble();
            double x1 = console.nextDouble();
            double h1 = console.nextDouble();
            double h2 = console.nextDouble();

            double t = x1/(v0*Math.cos(theta*(Math.PI/180)));
            double y = (v0*t*Math.sin(theta*(Math.PI/180)))-(0.5*9.81*Math.pow(t, 2));
            if(y-h1 < 1 || h2-y < 1) {
                System.out.println("Not Safe");
            }else {
                System.out.println("Safe");
            }
        }
    }
}
