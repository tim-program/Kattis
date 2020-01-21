package b;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bits {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Pattern p = Pattern.compile("[1]{1}");
		
		for(int i = console.nextInt();i>0;i--) {
			String s = console.next();
			int max = 0;
			for(int j = 1;j<=s.length();j++) {
				String temp = s.substring(0, j);
				Matcher m = p.matcher(Integer.toBinaryString(Integer.parseInt(temp)));
				int n = 0;
				boolean b = true;
				while(b) {
					b = m.find();
					if(b)
						n++;
				}
				if(n>max) {
					max = n;
				}
			}
			System.out.println(max);
		}
	}
}
