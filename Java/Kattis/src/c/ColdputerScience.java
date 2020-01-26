package c;

import java.util.Scanner;

public class ColdputerScience {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num=0;
        for(int iter = console.nextInt();iter>0;iter--){
            if(console.nextInt()<0){
                num++;
            }
        }
        System.out.println(num);
    }
}