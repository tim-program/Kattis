package b;

import java.util.Scanner;

public class BabyBites {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int mouthfuls = console.nextInt();
		for(int i = 1;i<=mouthfuls;i++) {
			String input = console.next();
			try {
				int n = Integer.parseInt(input);
				if(!(input.compareTo("mumber")==0||Integer.parseInt(input)==i)) {
					System.out.println("something is fishy");
					System.exit(0);
				}
			}catch(NumberFormatException e) {}	
		}
		System.out.println("makes sense");
	}
}
