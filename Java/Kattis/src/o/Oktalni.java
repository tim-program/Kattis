package o;

import java.util.Scanner;

public class Oktalni {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String s = console.next();
        String head;
        head = s.substring(0,s.length()%3);
        s = s.substring(s.length()%3);
        String num = "";
        for(int i = 0;s.length()>=3;) {
            num+=Integer.toOctalString(Integer.parseInt(s.substring(i,i+3),2));
            s = s.substring(i+3);
        }
        System.out.println(head+num);
    }
}
