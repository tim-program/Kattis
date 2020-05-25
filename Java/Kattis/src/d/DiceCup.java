package d;

import java.util.Scanner;

public class DiceCup {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num1 = console.nextInt(), num2 = console.nextInt();
        int[] ia = new int[num1+num2];
        for(int i = 1;i<=num1;i++){
            for(int j = 1;j<=num2;j++){
                ia[(j+i)-1]++;
            }
        }
        int j =1;
        int[] larg = new int[num1+num2];
        for(int i = 0;i<larg.length;i++){
            if(ia[i]>larg[0]){
                larg = new int[num1+num2];
                larg[0] = i;
                j=1;
            }else if(ia[i]==larg[0]){
                larg[j] = i;
                j++;
            }
        }
        for(int jg:larg){
            if(jg!=0)
                System.out.println(jg+1);
        }
    }
}
