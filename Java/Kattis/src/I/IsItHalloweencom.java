package I;

import java.util.Scanner;

public class IsItHalloweencom {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String date = console.nextLine();
        if(date.compareTo("DEC 25")==0||date.compareTo("OCT 31")==0) {
            System.out.println("yup");
        }else
            System.out.println("nope");
    }
}
