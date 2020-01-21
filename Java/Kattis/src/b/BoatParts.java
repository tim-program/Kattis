package b;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoatParts {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int parts = console.nextInt();
		int days = console.nextInt();
		int partsChanged=0;
		boolean avoided = true;
		Set<String> set = new HashSet();
		int i = 0;
		for(i = 1;i<=days;i++) {
			String part = console.next();
			if(!set.contains(part)) {
				set.add(part);
			}
			if(set.size()==parts) {
				avoided = false;
				break;
			}
		}
		System.out.println((avoided)?"paradox avoided":i);
	}
}
