package p;

import java.util.Scanner;

public class Pot {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int total = 0;
        for(int i = console.nextInt();i>0;i--){
            String num = console.next();
            int n=Integer.parseInt(num.substring(0, num.length()-1));
            int p=Integer.parseInt(Character.toString(num.charAt(num.length()-1)));
            total+= Math.pow(n,p);
        }
        System.out.println(total);
    }
}
