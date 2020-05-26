package s;

import java.util.Scanner;

public class SodaSlurper {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = console.nextInt()+console.nextInt();
        int div = console.nextInt();

        int drank = 0;

        while(true){
            if(num>=div){
                drank+=(num/div);
                num=(num/div)+(num%div);
            }else{
                System.out.println(drank);
                System.exit(0);
            }

        }
    }
}
