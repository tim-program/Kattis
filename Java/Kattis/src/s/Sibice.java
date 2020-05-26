package s;

import java.util.Scanner;

public class Sibice {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double iter = console.nextInt(), w = console.nextInt(),h = console.nextInt();
        double[] ar = new double[(int)iter];
        for(int i=0;i<iter;i++){
            ar[i] = console.nextInt();
        }
        for(double i:ar){
            if(i<=h||i<=w||Math.pow(i, 2)<=(Math.pow(h, 2)+Math.pow(w,2))){
                System.out.println("DA");
            }else{
                System.out.println("NE");
            }
        }
    }
}
