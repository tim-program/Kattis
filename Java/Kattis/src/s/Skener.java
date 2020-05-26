package s;

import java.util.Scanner;

public class Skener {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int r= console.nextInt(),c=console.nextInt();
        int zr = console.nextInt(), zc = console.nextInt();
        String[]sa = new String[r];
        String res="";
        for(int i = 0;i<r;i++){
            sa[i] = console.next();
        }

        for(int it = 0;it<r;it++){

            for(int j = 0;j <zr;j++){
                for(int t = 0;t<sa[it].length();t++){
                    for(int i = 0;i<zc;i++){
                        res+=sa[it].charAt(t);
                    }
                }
                System.out.println(res);
                res="";
            }
        }

    }
}
