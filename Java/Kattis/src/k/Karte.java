package k;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Karte {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String deck = console.nextLine();
        int[] ia = new int[4];
        ArrayList<String> list = new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();
        map.put('P',0);
        map.put('K',1);
        map.put('H',2);
        map.put('T',3);



        for(int i = 0;i<deck.length();i+=3){
            if(!list.contains(deck.substring(i,i+3))){
                list.add(deck.substring(i,i+3));
                ia[map.get(deck.charAt(i))]++;

            }else{
                System.out.println("GRESKA");
                System.exit(0);
            }
        }
        for(int i:ia){
            System.out.print(13-i+" ");
        }
    }
}
