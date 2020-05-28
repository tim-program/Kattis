package t;

import java.util.Scanner;

public class TripleTexting {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String text = console.next();
        int length = text.length() / 3;

        int sum1 = sumLetters(text.substring(0,length));
        int sum2 = sumLetters(text.substring(length,length*2));
        int sum3 = sumLetters(text.substring(length*2,length*3));

        if(sum1 == sum2 || sum1 == sum3){
            System.out.println(text.substring(0,length));
        }else{
            System.out.println(text.substring(length,length*2));
        }
    }


    static int sumLetters(String s){
        int sum = 0;
        for(int i = 0;i<s.length();i++){
            sum += s.charAt(i);
        }
        return sum;
    }
}
