package b;
import java.util.Scanner;

public class Bus {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int cases = console.nextInt();
		for(int j = 0;j<cases;j++) {
			double passengers = 0;
			int stops = console.nextInt();
			for(int i = 0;i<stops;i++) {
				passengers+=0.5;
				passengers*=2.0;
			}
			System.out.println((int)passengers);

		}
	}
}
