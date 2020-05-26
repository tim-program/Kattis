package r;

import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num1 = console.nextInt();
        int mean = console.nextInt();
        System.out.println(((mean*2)-num1));
    }
}
