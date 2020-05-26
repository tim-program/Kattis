package s;

import java.util.Scanner;

public class SumSquareDigitsFunction {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int cases = console.nextInt();
        for(int i = 0;i<cases;i++) {
            int k = console.nextInt();
            int base = console.nextInt();
            int num = console.nextInt();
            String numOfBase = Integer.toString(num,base);
            int total = 0;
            for(int j = 0;j<numOfBase.length();j++) {
                total+=Math.pow(Integer.parseInt(Character.toString(numOfBase.charAt(j)),base), 2);
            }
            System.out.printf("%d %d%n",k,total);
        }
    }
}
