package p;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Peragrams {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.next();
        Map<Character,Integer> map = new HashMap();
        for(int i = 97;i<123;i++){
            map.put((char)i,0);
        }
        for(int i = 0;i<str.length();i++){
            map.put(str.charAt(i), map.get(str.charAt(i))+1);
        }
        int odd = 0;
        for(int i = 97;i<123;i++){
            if(map.get((char)i)%2!=0){
                odd++;
            }
        }
        System.out.println((odd>0)?odd-1:0);

    }
}
