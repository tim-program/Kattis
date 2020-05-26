package s;

import java.util.Scanner;

public class Spavanac {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num1 = console.nextInt();
        int num2 = console.nextInt();

        if(num2<45){
            num2+=15;
            num1--;
            if(num1<0)num1+=24;
        }else{
            num2-=45;
        }
        System.out.println(num1+" "+num2);

    }
}
