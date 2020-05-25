package l;

import java.util.Scanner;

public class LastFactorialDigit {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            int cases = console.nextInt();
            for(int i = 0;i<cases;i++) {
                String lastFactorialDigit = Integer.toString(getFactorial(console.nextInt()));
                System.out.println(lastFactorialDigit.charAt(lastFactorialDigit.length()-1));
            }
        }

        static int getFactorial(int num) {
            if(num==0)return 1;
            return num*getFactorial(num-1);
        }
}
