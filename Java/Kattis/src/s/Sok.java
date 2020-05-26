package s;

import java.util.Scanner;

public class Sok {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double orangeJuice = console.nextDouble(),
                appleJuice = console.nextDouble(),
                pineappleJuice = console.nextDouble();
        double orangeRatio = console.nextDouble();
        double appleRatio = console.nextDouble();
        double pineappleRatio = console.nextDouble();

        double bigNum = orangeRatio*appleRatio*pineappleRatio;

        orangeJuice *= bigNum;
        appleJuice *= bigNum;
        pineappleJuice*=bigNum;

        int maxOJ = (int) (orangeJuice/orangeRatio);
        int maxAJ = (int) (appleJuice/appleRatio);
        int maxPJ = (int) (pineappleJuice/pineappleRatio);

        int mult = ((maxOJ<maxAJ&&maxOJ<maxPJ)?maxOJ:(maxAJ<maxPJ&&maxAJ<maxPJ)?maxAJ:maxPJ);

        orangeJuice-=(orangeRatio*mult);
        appleJuice-=(appleRatio*mult);
        pineappleJuice-=(pineappleRatio*mult);

        orangeJuice/=bigNum;
        appleJuice/=bigNum;
        pineappleJuice/=bigNum;

        System.out.printf("%.6f %.6f %.6f",orangeJuice,appleJuice,pineappleJuice);
    }
}
