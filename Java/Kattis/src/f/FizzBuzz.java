package f;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt(), y = console.nextInt(),n = console.nextInt();
        String[] sa = new String[n];
        boolean xb = false,yb = false;
        for(int i = 0;i<sa.length;i++){
            sa[i] = "";
            if((i+1)%x==0){
                sa[i] +="Fizz";
                xb = true;
            }
            if((i+1)%y==0){
                sa[i]+="Buzz";
                yb = true;
            }
            if(!yb&&!xb){
                sa[i]=Integer.toString(i+1);
            }
            yb = false;
            xb = false;
        }
        for(String str:sa){
            System.out.println(str);
        }
    }
}
