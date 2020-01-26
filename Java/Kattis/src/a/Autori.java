package a;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Autori {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String str = console.next();
        String fin = Character.toString(str.charAt(0));

        Pattern p = Pattern.compile("-[A-Z]");
        Matcher m = p.matcher(str);

        while(m.find()){
            fin+=m.group().charAt(1);
        }
        System.out.println(fin);
    }
}
