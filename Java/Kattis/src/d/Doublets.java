package d;

import java.util.ArrayList;
import java.util.Scanner;

public class Doublets {
    public static void main(String[] arg) {
        Scanner console = new Scanner(System.in);
        ArrayList list = new ArrayList();
        while(true) {
            String str = console.nextLine();
            if(str==""||str.contains(" "))break;
            list.add(str);
        }
        Object[] sa = list.toArray();

        String pair11 = console.next(),pair12 = console.next();
        String pair21 = console.next(),pair22 = console.next();
        for(Object s:sa) {
            System.out.println(s);
        }

    }
}
