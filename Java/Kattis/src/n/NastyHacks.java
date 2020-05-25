package n;

import java.util.Scanner;

public class NastyHacks {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int iter = console.nextInt();
        for(int i = 0;i<iter;i++){
            int r = console.nextInt(),e = console.nextInt(),
                    c = console.nextInt();
            if(e-c<r){
                System.out.println("do not advertise");
            }else if(e-c==r){
                System.out.println("does not matter");
            }else{
                System.out.println("advertise");
            }
        }
    }
}
