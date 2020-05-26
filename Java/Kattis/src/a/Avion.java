package a;

import java.util.Scanner;

public class Avion {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int blimps = 0;
        for(int i = 0;i<5;i++){
            String current = console.nextLine();
            if(current.contains("FBI")){
                System.out.print((i+1)+" ");
                blimps++;
            }
        }
        if(blimps==0){
            System.out.println("HE GOT AWAY!");
        }
    }
}
