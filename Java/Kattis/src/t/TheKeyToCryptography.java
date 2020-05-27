package t;

import java.util.Scanner;

public class TheKeyToCryptography {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.next().toLowerCase();
        String key = console.next().toLowerCase();
        String result="";
        for(int i = 0;i<str.length();i++){
            int ci = str.charAt(i)-(key.charAt(i)-97);
            if(ci<97){
                ci+=26;
            }
            char c = (char)ci;
            key+=c;
            result+=c;
        }
        System.out.println(result.toUpperCase());
    }
}
