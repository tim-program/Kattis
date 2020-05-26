package s;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SevenWonders {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.next().toLowerCase();
        Map<Character,Integer> map = new HashMap<>();
        map.put('c', 0);
        map.put('t', 0);
        map.put('g', 0);
        for(int i = 0;i<str.length();i++){
            switch(str.charAt(i)){
                case'c':
                    map.replace('c',map.get('c')+1);
                    break;
                case't':
                    map.replace('t',map.get('t')+1);
                    break;
                case'g':
                    map.replace('g',map.get('g')+1);
                    break;
            }
        }
        int total=0;
        total+= Math.pow(map.get('c'), 2);
        total+= Math.pow(map.get('t'),2);
        total+= Math.pow(map.get('g'), 2);
        while(true){
            if(map.get('g')>0&&map.get('t')>0&&map.get('c')>0){
                map.replace('c',map.get('c')-1);
                map.replace('t',map.get('t')-1);
                map.replace('g',map.get('g')-1);
                total+=7;
            }else{
                break;
            }
        }
        System.out.println(total);
    }
}
