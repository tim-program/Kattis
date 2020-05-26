package s;

import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while(true){
            int iter = console.nextInt();
            if(iter<0)System.exit(0);
            int total = 0,miles = console.nextInt(),sub = console.nextInt();;
            int newSub = 0;
            total+=miles*sub;
            for(int i = 0;i<iter-1;i++){
                miles = console.nextInt();
                newSub = console.nextInt();
                total+=miles*(newSub-sub);
                sub=newSub;
            }
            System.out.println(total+" miles");
        }
    }
}
