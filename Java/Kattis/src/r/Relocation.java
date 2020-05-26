package r;

import java.util.Scanner;

public class Relocation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int q = console.nextInt();
        int[] companies = new int[n];
        for(int i = 0;i<n;i++) {
            companies[i] = console.nextInt();
        }
        for(int i = 0;i<q;i++) {
            int type = console.nextInt();
            int arg1 = console.nextInt();
            int arg2 = console.nextInt();

            if(type==1) {
                companies[arg1-1] = arg2;
            }else {
                System.out.println(Math.abs(companies[arg1-1]-companies[arg2-1]));
            }
        }
    }
}
