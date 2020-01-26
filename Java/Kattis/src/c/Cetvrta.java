package c;

import java.util.Scanner;

public class Cetvrta {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = 0;
        int y = 0;
        for(int i = 0;i<3;i++){
            x^=console.nextInt();
            y^=console.nextInt();

        }
        System.out.printf("%d %d",x,y);
    }
}