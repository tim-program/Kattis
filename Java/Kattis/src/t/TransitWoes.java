package t;

import java.util.Scanner;

public class TransitWoes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int departureTime = console.nextInt();
        int classStartTime = console.nextInt();
        int numTransitRoutes = console.nextInt();

        int[] walkTimes = new int[numTransitRoutes+1];
        for(int i = 0;i<walkTimes.length;i++){
            walkTimes[i] = console.nextInt();
        }

        int[] travelTimes = new int [numTransitRoutes];
        for(int i = 0;i<travelTimes.length;i++){
            travelTimes[i] = console.nextInt();
        }

        int[] arrivalTimes = new int [numTransitRoutes];
        for(int i = 0;i<arrivalTimes.length;i++){
            arrivalTimes[i] = console.nextInt();
        }

        int totalTravelTime = departureTime;
        for(int i = 0;i<walkTimes.length - 1;i++){
            totalTravelTime += walkTimes[i];

            if(arrivalTimes[i] < totalTravelTime){
                if(totalTravelTime%arrivalTimes[i] != 0){
                    totalTravelTime = (totalTravelTime / arrivalTimes[i] + 1) * arrivalTimes[i];
                }else{
                    totalTravelTime = (totalTravelTime / arrivalTimes[i]) * arrivalTimes[i];
                }
            }else{
                totalTravelTime = arrivalTimes[i];
            }

            totalTravelTime += travelTimes[i];
        }

        totalTravelTime += walkTimes[walkTimes.length-1];

        if(totalTravelTime > classStartTime){
            System.out.println("no");
        }else{
            System.out.println("yes");
        }

    }
}
