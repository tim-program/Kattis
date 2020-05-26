package r;

import java.util.Scanner;

public class RoamingRomans {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double mileNum = console.nextDouble();
        double paces = mileNum*1000*5280/4854;
        System.out.println(Math.round(paces));
    }
}
