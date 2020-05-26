package p;

import java.util.Scanner;

public class PermutationEncryption {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while(true) {
            int iter = console.nextInt();
            if(iter==0)break;
            int[] ia = new int[iter];
            for(int i = 0;i<iter;i++) {
                ia[i] = console.nextInt();
            }
            console.nextLine();
            String s = console.nextLine();
            char[] encoded = new char[s.length()];
            char[] sca = s.toCharArray();
            for(int j = 0,h = 0;j<s.length()/iter;j++) {
                for(int g = 0;g<iter;g++,h++) {
                    encoded[h] = sca[(ia[g]-1)+(iter*j)];
                }
            }
            System.out.println("'"+new String(encoded)+"'");
        }
    }
}
