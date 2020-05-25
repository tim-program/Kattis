package o;

import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int iter = console.nextInt();
        int[] ia = new int[iter];
        for(int i = 0;i<iter;i++){
            ia[i]=console.nextInt();
        }
        for(int i:ia){
            if(i%2==0){
                System.out.println(i+" is even");
            }else{
                System.out.println(i+" is odd");
            }
        }
    }
}
