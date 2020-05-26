package r;

import java.util.Scanner;

public class Rijeci {
    public static void main(String[] arg) {
        Scanner console= new Scanner(System.in);
        int iter = console.nextInt();
        int a = 0,b = 1,diff = 1,placeholder = 0;
        for(int i = 0;i<iter;i++) {
            if(i!=0) {
                placeholder = a;
                a =b;
                diff = placeholder;
                b = a+placeholder;
            }
        }
        System.out.println(a+" "+b);
    }
}
