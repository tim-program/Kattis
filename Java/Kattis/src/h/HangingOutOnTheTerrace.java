package h;

import java.util.Scanner;

public class HangingOutOnTheTerrace {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int terraceMax = console.nextInt();
        int numEvents = console.nextInt();
        int currentTerrace = 0;
        int rejected = 0;
        for(int i = 0;i<numEvents;i++) {
            String eventType = console.next();
            int eventValue = console.nextInt();
            if(eventType.compareTo("enter")==0) {
                if(currentTerrace+eventValue>terraceMax)
                    rejected++;
                else
                    currentTerrace+=eventValue;
            }else if(eventType.compareTo("leave")==0) {
                currentTerrace-=eventValue;
            }
        }
        System.out.println(rejected);
    }
}
