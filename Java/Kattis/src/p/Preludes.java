package p;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Preludes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int caseNum = 0;
        while(console.hasNext()){
            ++caseNum;
            String note = console.next(), type = console.next();

            Map<String,String> map = new HashMap<>();
            map.put("Ab", "G#");map.put("G#", "Ab");
            map.put("A#", "Bb");map.put("Bb", "A#");
            map.put("C#", "Db");map.put("Db", "C#");
            map.put("D#", "Eb");map.put("Eb", "D#");
            map.put("F#", "Gb");map.put("Gb", "F#");

            System.out.println("Case "+caseNum+": "+((map.get(note)!=null)?(map.get(note)+" "+type):"UNIQUE"));
        }
    }
}
