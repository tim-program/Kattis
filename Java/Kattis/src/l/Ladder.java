package l;

import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int leg = console.nextInt(),angle = console.nextInt();
        System.out.println((int)Math.ceil(leg/Math.sin((angle*Math.PI)/180)));
    }
}
