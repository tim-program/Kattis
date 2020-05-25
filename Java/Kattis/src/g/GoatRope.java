package g;

import java.util.Scanner;

public class GoatRope {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double x = console.nextDouble(),
                y = console.nextDouble(),
                x1 = console.nextDouble(),
                y1= console.nextDouble(),
                x2 = console.nextDouble(),
                y2 = console.nextDouble();
        if(x>=x1 && x<=x2) {
            System.out.println((Math.abs(y-y1)>Math.abs(y-y2))?Math.abs(y-y2):Math.abs(y-y1));
        }else if(y>=y1&&y<=y2) {
            System.out.println((Math.abs(x-x1)>Math.abs(x-x2))?Math.abs(x-x2):Math.abs(x-x1));
        }else {

            //it works idk, explain it too yourself
            double x3 = -(x1-x2)+x1,
                    y3 = y1,
                    x4 = x1,
                    y4 = -(y1-y2)+y1;

            //use distance formula
            double dist1 = Math.sqrt(Math.pow((x1-x),2)+Math.pow((y1-y),2));
            double dist2 = Math.sqrt(Math.pow((x2-x),2)+Math.pow((y2-y),2));
            double dist3 = Math.sqrt(Math.pow((x3-x),2)+Math.pow((y3-y),2));
            double dist4 = Math.sqrt(Math.pow((x4-x),2)+Math.pow((y4-y),2));
            double[] da = {dist1,dist2,dist3,dist4};
            java.util.Arrays.sort(da);
            System.out.printf("%.2f",da[0]);
        }
    }
}
