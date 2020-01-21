package a;

import java.util.Scanner;

public class ACMContestScoring {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int[] penalties = new int[26];
        int numRight = 0;
        int score = 0;
        while(true) {
            int min = console.nextInt();
            if(min == -1) {
                break;
            }

            char testChar = console.next().charAt(0);
            String result = console.next();

            if(result.equals("wrong")) {
                penalties[testChar-65]+=20;
            }else if(result.equals("right")) {
                numRight++;
                score+=(penalties[testChar-65]+min);

            }
        }
        System.out.println(numRight+" "+score);
    }
}