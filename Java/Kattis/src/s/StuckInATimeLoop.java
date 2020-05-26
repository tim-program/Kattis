package s;

import java.util.Scanner;

public class StuckInATimeLoop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int iterate = console.nextInt();
        for(int i=1;i<=iterate;i++){
            System.out.println(i+" Abracadabra");


        }
    }
}
