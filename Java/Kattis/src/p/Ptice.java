package p;

import java.util.Scanner;

public class Ptice {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        console.next();
        String str = console.next();
        String[] sa = {"ABC","BABC","CCAABB",
                "Adrian","Bruno","Goran"};
        int[] ia = new int[3];
        for(int it = 0;it<3;it++){
            for(int i = 0,j = 0;i<str.length();i++,j++){
                if(sa[it].charAt(j)==str.charAt(i))
                    ia[it]++;
                if(j==sa[it].length()-1)
                    j=-1;
            }
        }

        int largest = 0;
        for(int i =0;i<3;i++){
            if(largest<ia[i]){
                largest = ia[i];
            }
        }
        System.out.println(largest);
        for(int i=0;i<3;i++	){
            if(ia[i]==largest){
                System.out.println(sa[i+3]);
            }
        }
    }
}
