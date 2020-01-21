package b;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bela {
public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	int iter = 4*console.nextInt();
	char dom = console.next().charAt(0);
	
	Map<Character,Integer> map = new HashMap<>();
	map.put('A', 11);
	map.put('K',4);
	map.put('Q',3);
	map.put('J', 2);
	map.put('T', 10);
	map.put('9', 0);
	map.put('8',0);
	map.put('7', 0);
	
	Map<Character,Integer> domMap = new HashMap<>();
	domMap.put('J', 20);
	domMap.put('9', 14);
	
	int total = 0;
	
	for(int i = 0;i<iter;i++){
		String str = console.next();
		if(str.charAt(1)==dom&&(str.charAt(0)=='J'||str.charAt(0)=='9')){
			total+=domMap.get(str.charAt(0));
		}else{
			total+=map.get(str.charAt(0));
		}
	}
	System.out.println(total);
}
}
