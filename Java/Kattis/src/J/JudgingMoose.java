package J;

import java.util.Scanner;

public class JudgingMoose {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int l = console.nextInt(),r = console.nextInt();
        if(l==r){
            System.out.println((l<1)?"Not a moose":"Even "+(l*2));
        }else{
            System.out.print("Odd "+((l>r)?(l*2):(r*2)));
        }
    }
}
