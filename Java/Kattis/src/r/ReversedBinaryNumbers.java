package r;

import java.util.Scanner;

public class ReversedBinaryNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int num = console.nextInt();
        String str = Integer.toBinaryString(num);
        String nStr = new StringBuilder(str).reverse().toString();
        System.out.println(Integer.parseInt(nStr,2));
    }
}
