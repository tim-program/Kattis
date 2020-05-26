package s;

import java.util.Scanner;

public class Soylent {
    public static void main(String[] arg) {
        Scanner console = new Scanner(System.in);
        int iter = console.nextInt();
        for(int i = 0;i<iter;i++) {
            double cal = console.nextInt();
            System.out.println((int)Math.ceil(cal/400));
        }
    }
}
