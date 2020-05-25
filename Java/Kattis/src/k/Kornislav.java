package k;

import java.util.Arrays;
import java.util.Scanner;

public class Kornislav {
    public static void main(String[] args) {
        int[] ia = new int[4];
        Scanner console = new Scanner(System.in);
        for(int i=0;i<4;i++){
            ia[i] = console.nextInt();
        }
        Arrays.sort(ia);
        System.out.println(ia[0]*ia[2]);
    }
}
