package a;
import java.util.Scanner;

public class ARealChallenge {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double area = console.nextDouble();
        double side = Math.sqrt(area);
        double length = side*4.0;
        System.out.println(length);
    }
}
