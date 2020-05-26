package p;

import java.util.Scanner;

public class PaulEigon {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt(),
                p = console.nextInt(),
                q = console.nextInt();
        String server = "paul";
        int turns = 0;

        turns = ((p+q)/n)+1;

        if(n>(q+p)) {
            server = "paul";
        }else if(turns%2==0) {
            server = "opponent";
        }else {
            server = "paul";
        }

        System.out.println(server);
    }
}
