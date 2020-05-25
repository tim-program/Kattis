package l;

import java.util.Scanner;

public class LeftBeehind {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while(true){
            int num1 = console.nextInt(), num2 = console.nextInt();
            if(num1==0&&num2==0)System.exit(0);
            if(num1+num2==13){
                System.out.println("Never speak again.");
            }else if(num1==num2){
                System.out.println("Undecided.");
            }else if(num1>num2){
                System.out.println("To the convention.");

            }else{
                System.out.println("Left beehind.");
            }
        }
    }
}
