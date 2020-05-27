package t;

import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int mb = console.nextInt();
        int total=0;
        int iterate=console.nextInt();
        for(int i=0;i<iterate;i++){
            total+=console.nextInt();
        }
        System.out.println((((mb*iterate)-total)+mb));
    }
}
