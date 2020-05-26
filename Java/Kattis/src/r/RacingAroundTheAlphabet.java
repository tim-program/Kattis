package r;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RacingAroundTheAlphabet {
    static Map<Character,Integer> map;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int cases = console.nextInt();
        double circleCircum = 2.0*Math.PI*(60.0/2.0);
        map = new HashMap<Character,Integer>();

        for(int i = 1,j=65;i<=28;i++,j++) {
            if(i==27) {
                map.put(' ', 27);
            }
            if(i==28) {
                map.put("\'".charAt(0), 28);
            }else
                map.put((char)j,i);
        }

        console.nextLine();
        for(int i = 0;i<cases;i++) {
            String phrase = console.nextLine();
            double timeStamp = 0.0;
            for(int j = 0;j<phrase.length();j++) {
                char currentChar = phrase.charAt(j);
                timeStamp+=1;
                if(j==phrase.length()-1)break;
                char nextChar = phrase.charAt(j+1);

                if(currentChar == nextChar)continue;

                double dist1,dist2;

                //calc distance
                if(map.get(nextChar)>map.get(currentChar)) {
                    dist1 = map.get(nextChar)-map.get(currentChar);
                    dist2 = 28 - (map.get(nextChar)-map.get(currentChar));
                }else {
                    dist1 = map.get(currentChar)-map.get(nextChar);
                    dist2 = 28 - (map.get(currentChar)-map.get(nextChar));
                }
                dist1*=circleCircum/28.0;
                dist2*=circleCircum/28.0;

                double time1,time2;
                time1 = dist1/15.0;
                time2 = dist2/15.0;

                timeStamp += (time1>time2)?time2:time1;
            }
            System.out.printf("%.10f%n",timeStamp);
        }
    }
}
