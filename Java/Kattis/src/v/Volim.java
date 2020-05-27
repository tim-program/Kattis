package v;

import java.util.Scanner;

public class Volim {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int currentPerson = console.nextInt();
        int questionsAsked = console.nextInt();
        final int TIME_STAMP_MAX = 210;
        int timeStamp = 0;
        for(int i = 0;i<questionsAsked;i++) {
            timeStamp+=console.nextInt();
            char questionStatus = console.next().charAt(0);
            if(timeStamp>=TIME_STAMP_MAX) {
                System.out.println(currentPerson);
                break;
            }
            if(questionStatus=='N'||questionStatus=='P') {
                continue;
            }else if(questionStatus=='T') {
                currentPerson+=1;
                if(currentPerson>8)currentPerson=1;
            }
        }
    }
}
