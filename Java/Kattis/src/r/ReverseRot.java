package r;

import java.util.Scanner;

public class ReverseRot {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while(true){
            int shift = console.nextInt();
            if(shift==0)System.exit(0);
            String code = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.",
                    str = console.next(),
                    newStr = "";
            for(int i = 0;i<str.length();i++){
                int ci = str.charAt(i);
                if(ci=='.'){
                    ci='\\';
                }else if(ci=='_'){
                    ci='[';
                }
                ci +=shift;

                if(ci>92)ci-=28;
                if(ci=='[')ci='_';
                if(ci=='\\')ci='.';
                newStr+=(char)ci;

            }
            System.out.println(new StringBuilder(newStr).reverse());
        }

    }
}
