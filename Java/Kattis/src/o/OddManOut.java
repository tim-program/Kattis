package o;

import java.util.ArrayList;
import java.util.Scanner;

public class OddManOut {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int iter = console.nextInt();
        ArrayList<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i < iter; i++) {
            int num = console.nextInt();
            for (int j = 0; j < num; j++) {
                int n = console.nextInt();
                if (l.contains(n)) {
                    l.remove(n);
                } else {
                    l.add(n);
                }
            }
            System.out.println("Case #" + (i + 1) + ": " + l.get(0));
            l.clear();
        }
    }
}
