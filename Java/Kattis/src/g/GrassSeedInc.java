package g;

import java.util.Scanner;

public class GrassSeedInc {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double total = 0.0;
        double cost = console.nextDouble();
        for(int i = console.nextInt();i>0;i--){
            total+=console.nextDouble()*console.nextDouble()*cost;
        }
        System.out.printf("%n%.7f",total);

    }
}
