package s;

import java.util.Scanner;

public class Skocimis {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n1 = console.nextInt(),
                n2 = console.nextInt(),
                n3 = console.nextInt();
        System.out.println((Math.abs(n1-n2)-1>Math.abs(n2-n3)-1)?Math.abs(n2-n1)-1:Math.abs(n2-n3)-1);
    }
}
