package h;

import java.util.Scanner;

public class HissingMicrophone {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.next();
        System.out.println(((str.contains("ss")?"hiss":"no hiss")));
    }
}
