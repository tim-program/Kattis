package d;

import java.time.LocalDate;
import java.util.Scanner;

public class Datum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int day = console.nextInt(),m = console.nextInt();
        String str = LocalDate.of(2009, m, day).getDayOfWeek().toString().toLowerCase();
        System.out.println(Character.toString(str.charAt(0)).toUpperCase()+
                str.substring(1,str.length()));
    }
}
