package h;

import java.util.Scanner;

public class HydrasHeads {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        for(;;) {
            int heads = console.nextInt();
            int tails = console.nextInt();
            int moves = 0;
            if(heads == 0 && tails == 0)
                System.exit(0);

            if(heads%2==1&&tails==0) {
                System.out.println(-1);
                continue;
            }

            if(tails%2==1) {
                tails++;
                moves++;
            }

            if(heads%2==0) {
                if((tails/2)%2==1) {
                    tails+=2;
                    moves+=2;
                }
                moves+=tails/2;
                heads+=tails/2;
                moves+=heads/2;

            }else if(heads%2==1){
                if((tails/2)%2==0) {
                    tails+=2;
                    moves+=2;
                }
                moves+=tails/2;
                heads+=tails/2;
                moves+=heads/2;
            }

            System.out.println(moves);

        }
    }
}
