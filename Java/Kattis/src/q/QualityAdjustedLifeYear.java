package q;

import java.util.Scanner;

public class QualityAdjustedLifeYear {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int constantQualityNum = console.nextInt();
        double accumulated = 0;
        for(int i = 0;i<constantQualityNum;i++) {
            accumulated += console.nextDouble()*console.nextDouble();
        }
        System.out.printf("%.3f",accumulated);
    }
}
