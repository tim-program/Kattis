package s;

import java.util.Scanner;

public class StarArrangments {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        System.out.println(num+":");
        for( int i = 1;i<num;i++){
            if(test(num,i)){
                System.out.println(i+","+(i-1));
            }
            if(num%i==0&&i>1){
                System.out.println(i+","+i);
            }
        }
    }
    public static boolean test(int num,int i){
        if(i<2)return false;
        for(int j = i-1,g = 3;num>0;g++){
            if(g%2==1){
                num-=i;
            }else if(g%2==0){
                num-=j;
            }
        }
        if(num==0){
            return true;
        }
        return false;
    }
}
