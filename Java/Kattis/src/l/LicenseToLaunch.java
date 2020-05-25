package l;

import java.util.Scanner;

public class LicenseToLaunch {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int minTrash = Integer.MAX_VALUE;
        int bestDay = 0;
        for(int i = 0;i<n;i++) {
            int currentTrash = console.nextInt();
            if(currentTrash<minTrash) {
                bestDay = i;
                minTrash = currentTrash;
            }
        }
        System.out.println(bestDay);
    }
}
