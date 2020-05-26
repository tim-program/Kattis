package p;

import java.util.Scanner;

public class Parking2 {
    public static void main(String[] arg) {
        Scanner console = new Scanner(System.in);
        int iter = console.nextInt();
        for(int i = 0;i<iter;i++) {
            int places = console.nextInt();
            int smallest = 100,largest = 0;
            for(int j = 0;j<places;j++) {
                int num = console.nextInt();
                if(num>largest)largest=num;
                if(num<smallest)smallest = num;
            }
            System.out.println((largest-smallest)*2);
        }

    }
}
