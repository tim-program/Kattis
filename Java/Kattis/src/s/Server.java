package s;

import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        long total = 0;
        long iter = console.nextInt();
        long max = console.nextInt();
        long i = 0;
        for(;i<iter;i++){
            total+=console.nextInt();
            if(total>max){
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println(i);
    }
}
