package d;

import java.util.Scanner;

public class DifferentDistances {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while(true) {
            String[] input = console.nextLine().split(" ");
            if(input.length == 1 && input[0].compareTo("0" )== 0)break;

            double x1 = Double.parseDouble(input[0]);
            double y1 = Double.parseDouble(input[1]);
            double x2 = Double.parseDouble(input[2]);
            double y2 = Double.parseDouble(input[3]);
            double p = Double.parseDouble(input[4]);

            double answer = Math.pow(Math.pow(Math.abs(x1-x2), p) + Math.pow(Math.abs(y1-y2),p),(1.0/p));
            System.out.printf("%.10f%n",answer);
        }
    }
}
