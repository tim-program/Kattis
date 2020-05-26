package s;

import java.util.ArrayList;
import java.util.Scanner;

public class SimonSays {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int iter = Integer.parseInt(console.next());
        console.nextLine();
        ArrayList l = new ArrayList();
        for(int i = 0;i<iter;i++) {
            String s = console.nextLine();
            if(s.startsWith("Simon says ")) {
                l.add(s.substring(11));
            }
        }
        for(Object s:l) {
            System.out.println(s.toString());
        }
    }
}
