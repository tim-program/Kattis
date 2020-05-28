package p;

import java.util.Scanner;

public class PieceOfCake {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sideLength = console.nextInt();
        int horizontal = console.nextInt();
        int vertical = console.nextInt();
        int thickness = 4;

        int maxH = max(horizontal,sideLength - horizontal);
        int maxV = max(vertical, sideLength - vertical);

        System.out.println((maxH * maxV * thickness));
    }

    static int max(int a, int b){
        return (a>b) ? a : b;
    }
}
