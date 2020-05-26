package p;

import java.util.Scanner;

public class Patuljci {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int[] ia = new int[9];
        int total=0;
        for(int i = 0;i<9;i++){
            ia[i] = console.nextInt();
            total+=ia[i];
        }

        for(int i =0;i<9;i++){
            for(int j = 0;j<9;j++){
                if(i!=j){
                    if(total-(ia[i]+ia[j])==100){
                        print(ia,i,j);
                    }
                }
            }
        }
    }
    static void print(int[] ia,int i,int j){
        for(int g = 0;g<9;g++){
            if(!(g==i)&&!(j==g)){
                System.out.println(ia[g]);
            }
        }
        System.exit(0);
    }
}
