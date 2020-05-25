package n;

import java.util.Scanner;

public class NumberFun {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int iter = console.nextInt();
        boolean works;
        for(int i = 0;i<iter;i++){
            works = false;
            double n1 = console.nextInt(),
                    n2 = console.nextInt(),
                    sum = console.nextInt();
            if(n1-n2==sum||n2-n1==sum){
                works = true;
            }else if(n1+n2==sum){
                works = true;
            }else if(n2/n1==sum||n1/n2==sum){
                works = true;
            }else if(n1*n2==sum){
                works = true;
            }
            if(works){
                System.out.println("Possible");
            }else{
                System.out.println("Impossible");
            }
        }
    }
}
