package e;

import java.util.Scanner;

public class EncodedMessage {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int iter = console.nextInt();
        for(int i = 0;i<iter;i++){
            String str = console.next();
            int sqr = (int)Math.sqrt(str.length());
            int add = sqr;
            for(int j = 0;j<sqr;j++){

                for(int g = add;g<=str.length();g+=sqr){
                    System.out.print(str.charAt(g-1));
                }
                add--;
            }
            System.out.println();
        }
    }
}
