package b;

import java.util.Scanner;
//incomplete
public class Backspace {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String in = console.next();

		boolean again = false;
		for(int i=0;i<in.length();i++) {
			do {
				again= false;
				if(i>0&&i<in.length()&&in.charAt(i)=='<') {
					again =true;
					if(i==1) {
						in = in.substring(i+1);
					}else {
						in =in.substring(0, i-1)+in.substring(i+1);
						i-=1;
					}
					
				}
			}while(again);
			
		}
		System.out.println(in);
		}

}
