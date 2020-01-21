package b;

import java.util.Scanner;

public class BatterUp {
public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	double hits =0,total=0;
	
	for(int i=console.nextInt();i>0;i--){
		int num = console.nextInt();
		if(num>=0){
			hits++;
			total+=num;
		}
	}
	System.out.println(total/hits);
}
}
