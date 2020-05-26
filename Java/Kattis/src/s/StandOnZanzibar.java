package s;

import java.util.Scanner;

public class StandOnZanzibar {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        int iter = console.nextInt();
        for(int i = 0;i<iter;i++) {
            int added = 0;
            int should = 0;
            while(true) {
                int num = console.nextInt();
                if(num==0)break;
                if(should!=0&&num>should)
                    added += num-should;
                should = (num*2);
            }
            System.out.println(added);
        }
    }
}
