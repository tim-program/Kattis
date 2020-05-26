package p;

import java.util.Scanner;

public class ProvincesAndGold {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int g = console.nextInt(),
                s = console.nextInt(),
                c = console.nextInt();
        int buyingPower = g*3+s*2+c*1;
        String bestCards = "";
        if(buyingPower>=8) {
            bestCards+="Province or ";
        }else if(buyingPower>=5) {
            bestCards+="Duchy or ";
        }else if(buyingPower>=2) {
            bestCards+="Estate or ";
        }

        if(buyingPower>=6) {
            bestCards+="Gold";
        }else if(buyingPower>=3) {
            bestCards+="Silver";
        }else {
            bestCards+="Copper";
        }

        System.out.println(bestCards);
    }
}
