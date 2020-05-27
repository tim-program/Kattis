package z;

import java.util.Scanner;

public class Zamka {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String min = console.next();
        String max = console.next();
        int target = console.nextInt();
        int targetMin = findLowest(min,target);
        int targetMax = findHighest(max,target);
        System.out.println(targetMin);
        System.out.println(targetMax);


    }

    private static int findLowest(String min, int target){
        int numMin = Integer.parseInt(min);
        if(calcTotal(min)==target)return numMin;
        while(true) {
            numMin++;
            if(calcTotal(Integer.toString(numMin))==target)return numMin;
            if(numMin==10000)break;
        }
        return 0;
    }
    private static int findHighest(String max,int target) {
        int numMax = Integer.parseInt(max);
        if(calcTotal(max)==target)return numMax;
        while(true) {
            numMax--;
            if(calcTotal(Integer.toString(numMax))==target)return numMax;
            if(numMax==0)break;
        }
        return 0;
    }
    static int calcTotal(String numS) {
        int numT = 0;
        for(int i = 0;i<numS.length();i++) {
            numT+=Integer.parseInt(Character.toString(numS.charAt(i)));
        }
        return numT;
    }
}
