package r;

import java.util.Scanner;

public class Railroad2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = (4*console.nextInt())+(3*console.nextInt());
        System.out.println((num%2==0)?"possible":"impossible");
    }
}
