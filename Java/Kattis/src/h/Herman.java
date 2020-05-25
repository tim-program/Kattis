package h;

import java.util.Scanner;

public class Herman {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        System.out.printf("%.6f%n", Math.PI*Math.pow(num, 2));
        System.out.printf("%.6f",Math.pow(num, 2)*2);
    }
}
