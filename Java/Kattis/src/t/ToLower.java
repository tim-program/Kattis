package t;

import java.util.Scanner;

public class ToLower {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int problems = console.nextInt(),
                testCases = console.nextInt();
        console.nextLine();
        int problemsSolved = 0;
        for(int i = 0;i<problems;i++) {
            boolean dontSkip = true;
            int wrongAnswers = 0;
            for(int j =0;j<testCases;j++) {
                String caseInput = console.nextLine();
                if(dontSkip&&nextCharsCapital(caseInput)) {
                    wrongAnswers++;
                    dontSkip = false;
                }
            }
            if(wrongAnswers==0) {
                problemsSolved++;
            }
        }
        System.out.println(problemsSolved);
    }

    public static boolean nextCharsCapital(String s) {
        for(int i = 1;i<s.length();i++) {
            if(s.charAt(i)<97) {
                return true;
            }
        }
        return false;
    }
}
