package I;

import java.util.ArrayList;
import java.util.Scanner;

public class ICPCAwards {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int iter = console.nextInt();
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> listO = new ArrayList<String>();
        for(int i = 0;i<iter;i++) {
            String strA = console.next();
            String strN = console.next();
            if(!list.contains(strA)) {
                list.add(strA);
                listO.add(strA+" "+strN);
            }
        }
        int i = 0;
        for(Object o:listO) {
            System.out.println(o.toString());
            i++;
            if(i==12)System.exit(0);
        }
    }
}
