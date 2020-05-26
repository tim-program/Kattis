package p;

import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt(),
                b = console.nextInt(),
                c = console.nextInt();
        int[] times = new int[100];

        for(int i = 0;i<3;i++) {
            int from = console.nextInt();
            int to = console.nextInt();
            for(int j = from-1;j<to-1;j++) {
                times[j]++;
            }
        }
        int totalPay = 0;
        for(int i:times) {
            switch(i) {
                case 1:
                    totalPay+=a;
                    break;
                case 2:
                    totalPay+=b*2;
                    break;
                case 3:
                    totalPay+=c*3;
                    break;
            }
        }

        System.out.println(totalPay);

    }
}
