package t;

import java.util.Scanner;

public class Tri {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt(),
                y = console.nextInt(),
                z = console.nextInt();
        char operand1 = 0,operand2 = 0;

        if(x+y==z) {
            operand1 = '+';
            operand2 = '=';
        }else if(x-y==z) {
            operand1 = '-';
            operand2 = '=';
        }else if(x*y==z) {
            operand1 = '*';
            operand2 = '=';
        }else if(x/y==z) {
            operand1 = '/';
            operand2 = '=';
        }else if(x==y+z) {
            operand1 = '=';
            operand2 = '+';
        }else if(x==y-z) {
            operand1 = '=';
            operand2 = '-';
        }else if(x==y*z) {
            operand1 = '=';
            operand2 = '*';
        }else if(x==y/z) {
            operand1 = '=';
            operand2 = '/';
        }else {
            System.out.println("waka flaka");
        }
        System.out.println(x+Character.toString(operand1)+y+Character.toString(operand2)+z);
    }
}
