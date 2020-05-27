package u;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UnbearableZoo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int listNum = 1;
        while(true) {
            int lines = console.nextInt();
            console.nextLine();
            if(lines == 0)break;
            Map<String,Integer> animals = new HashMap<String,Integer>();
            for(int i = 0;i<lines;i++) {
                String[] inputLine = console.nextLine().split(" ");
                String currentAnimal = inputLine[inputLine.length-1].toLowerCase();
                if(animals.containsKey(currentAnimal)) {
                    animals.put(currentAnimal, animals.get(currentAnimal)+1);
                }else {
                    animals.put(currentAnimal, 1);
                }
            }

            Object[] keys =  animals.keySet().toArray();
            java.util.Arrays.sort(keys);
            int[] amounts = new int[keys.length];
            System.out.println("List "+listNum+":");
            for(int i = 0;i<keys.length;i++) {
                amounts[i] = animals.get(keys[i]);
                System.out.println(keys[i]+" | "+amounts[i]);
            }
            listNum++;
        }
    }
}
