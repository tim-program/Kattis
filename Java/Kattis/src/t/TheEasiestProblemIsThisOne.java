package t;

import java.util.Scanner;

public class TheEasiestProblemIsThisOne {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while(true) {
            int N = console.nextInt();
            int NSum = findSum(N);
            if(N==0)break;
            for(int i = 11;i<Integer.MAX_VALUE;i++) {
                if(NSum==findSum(N*i)) {
                    System.out.println(i);
                    break;
                }
            }

        }
    }
    static int findSum(int num){
        String s = Integer.toString(num);
        int total = 0;
        for(int i = 0;i<s.length();i++) {
            total+=Integer.parseInt(Character.toString(s.charAt(i)));
        }

        return total;
    }
}
