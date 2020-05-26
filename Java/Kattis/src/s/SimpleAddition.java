package s;

import java.math.BigInteger;
import java.util.Scanner;

public class SimpleAddition {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String si1 = console.next(), si2 = console.next();
        BigInteger bi1 = new BigInteger(si1);
        BigInteger bi2 = new BigInteger(si2);
        System.out.println(bi1.add(bi2).toString());

    }
}
