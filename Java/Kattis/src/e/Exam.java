package e;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numCorrect = console.nextInt();
        String myAnswers = console.next();
        String friendsAnswers = console.next();

        int numSame = 0,
                numDiff = 0,
                numQues = myAnswers.length() ;
        for(int i = 0;i<myAnswers.length();i++) {
            if(myAnswers.charAt(i)==friendsAnswers.charAt(i)) {
                numSame++;
            }else {
                numDiff++;
            }
        }
        //numSame-numCorrect calculates the number of answers that are definitly wrong
        //subtract that from the number of differently answered question
        //add that to the numSame and you have the maxCorrect
        int maxCorrect = numSame+(numDiff-Math.abs(numSame-numCorrect));
        System.out.println(maxCorrect);
    }
}
