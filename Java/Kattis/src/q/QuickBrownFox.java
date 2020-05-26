package q;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuickBrownFox {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int iter = console.nextInt();
        console.nextLine();
        for(int i = 0;i<iter;i++){
            String str = console.nextLine().toLowerCase();
            String missing = "missing ";
            boolean pangram = true;
            for(int j = 97;j<123;j++){
                Pattern p = Pattern.compile(Character.toString((char)j));
                Matcher m = p.matcher(str);
                if(!m.find()){
                    pangram = false;
                    missing+=(char)j;
                }
            }
            System.out.println((pangram)?"pangram":missing);
        }
    }
}
