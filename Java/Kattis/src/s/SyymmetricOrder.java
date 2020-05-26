package s;

import java.util.Scanner;

public class SyymmetricOrder {
    public static void main(String[] arg) {
        Scanner console = new Scanner(System.in);
        int set = 1;
        while(true) {

            int iter = console.nextInt();
            if(iter==0)System.exit(0);
            String[] sa = new String[iter];
            for(int x=0, i=0,j=iter;iter>0;) {
                if(x==0) {
                    sa[i] = console.next();
                    i++;
                    x=1;
                }else {
                    sa[j-1]= console.next();
                    j--;
                    x=0;
                }
                iter--;
            }
            System.out.println("SET "+set);
            for(String s:sa) {
                System.out.println(s);
            }
            set++;
        }
    }
}
