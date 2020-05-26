package p;

import java.util.Scanner;

public class Planina {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int start = 2;
        int iteration = console.nextInt();

        for(int i=0;i<iteration;i++){
            start+=(start-1);
        }
        System.out.println((int)Math.pow(start,2));
    }
}
