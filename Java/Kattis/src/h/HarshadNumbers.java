package h;

import java.util.Scanner;

public class HarshadNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        for(int i = num;i>0;i++) {
            int digitTotal = getTotal(i);
            if(i%digitTotal==0) {
                System.out.println(i);
                break;
            }
        }
    }

    static int getTotal(int num) {
        char[] ca= Integer.toString(num).toCharArray();
        int total = 0;
        for(char c:ca) {
            total+=(c-48);
        }
        return total;
    }
}
