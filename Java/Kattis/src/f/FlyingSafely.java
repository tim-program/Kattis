package f;

import java.util.Scanner;

public class FlyingSafely {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int cases = console.nextInt();
        for (int i = 0; i < cases; i++) {
            int a = console.nextInt();
            int b = console.nextInt();
            System.out.println(a - 1);
            for (int j = 0; j < b; j++) {
                console.nextLine();
            }
        }
        console.close();
    }
}
