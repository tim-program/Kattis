package f;

import java.util.Scanner;

public class Filip {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int a = Integer.parseInt(new StringBuilder(console.next()).reverse().toString());
        int b = Integer.parseInt(new StringBuilder(console.next()).reverse().toString());
        System.out.println((a>b)?a:b);
    }
}
