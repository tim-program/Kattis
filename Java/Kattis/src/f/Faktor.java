package f;

import java.util.Scanner;

public class Faktor {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int pub = console.nextInt();
        int imp = console.nextInt();

        System.out.println((pub*(imp-1)+1));
    }
}
