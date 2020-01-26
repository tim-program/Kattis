package c;
import java.util.Scanner;

public class ChanukahChallenge {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int cases = console.nextInt();
        for(int i = 0;i<cases;i++) {
            int k = console.nextInt();
            int n = console.nextInt();
            int totalCandles = 0;
            for(int j = 1;j<=n;j++) {
                totalCandles+=j;
            }
            System.out.printf("%d %d%n",k,(n+totalCandles));
        }
    }
}
