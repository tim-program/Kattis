package o;

import java.util.Scanner;

public class OddGnome {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int iter = console.nextInt();
        for(int i =0;i<iter;i++) {
            int gnomeNum = console.nextInt();

            int[] array = new int[gnomeNum];
            for(int j = 0;j<gnomeNum;j++) {
                array[j] = console.nextInt();
            }
            for(int j=1;j<gnomeNum;j++) {


                if(!(array[j]-array[j-1]==1)) {
                    System.out.println(j+1);
                    break;
                }

            }
        }
    }
}
