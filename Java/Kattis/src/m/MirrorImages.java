package m;

import java.util.Scanner;

public class MirrorImages {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int iter = console.nextInt();

        for(int i = 0;i<iter;i++) {
            int c = console.nextInt(),
                    r = console.nextInt();
            char[][] ca = new char[c][r];

            for(int a = 0;a<c;a++) {
                String strxy = console.next();
                for(int b = 0;b<r;b++) {
                    ca[a][b] = strxy.charAt(b);
                }
            }

            System.out.println("Test "+(i+1));
            for(int a = ca.length-1;a>=0;a--) {
                for(int b = ca[0].length-1;b>=0;b--) {
                    System.out.print(ca[a][b]);
                }
                System.out.println();
            }
        }
    }
}
