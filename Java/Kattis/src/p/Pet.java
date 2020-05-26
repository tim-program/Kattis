package p;

import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] ia = new int[5];
        for(int j=0;j<5;j++){
            for(int i = 0;i<4;i++){
                ia[j]+=console.nextInt();
            }
        }
        int largest=0, contestant=0;
        for(int i = 0;i<5;i++){
            if(ia[i]>largest){
                largest = ia[i];
                contestant = i+1;

            }
        }
        System.out.println(contestant+" "+largest);
    }
}
