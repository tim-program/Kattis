package o;

import java.util.Scanner;

public class OneChickenPerPerson {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt(), m=console.nextInt();

        int res = m-n;
        if(res<0) {
            res=Math.abs(res);
            System.out.println("Dr. Chaz needs "+res+((res==1)?" more piece of chicken!":" more pieces of chicken!"));
        }else {
            res=Math.abs(res);
            System.out.println("Dr. Chaz will have "+res+((res==1)?" piece of chicken left over!":" pieces of chicken left over!"));
        }
    }
}
