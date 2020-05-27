package t;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T9Spelling {
    public static void main(String[] arg) {
        Scanner console = new Scanner(System.in);
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "2");
        map.put("b", "22");
        map.put("c", "222");
        map.put("d", "3");
        map.put("e", "33");
        map.put("f", "333");
        map.put("g", "4");
        map.put("h", "44");
        map.put("i", "444");
        map.put("j", "5");
        map.put("k", "55");
        map.put("l", "555");
        map.put("m", "6");
        map.put("n", "66");
        map.put("o", "666");
        map.put("p", "7");
        map.put("q", "77");
        map.put("r", "777");
        map.put("s", "7777");
        map.put("t", "8");
        map.put("u", "88");
        map.put("v", "888");
        map.put("w", "9");
        map.put("x", "99");
        map.put("y", "999");
        map.put("z", "9999");
        map.put(" ", "0");

        int iter = console.nextInt();
        console.nextLine();
        for (int i = 0; i < iter; i++) {

            String initial = console.nextLine().toLowerCase(), fin = "";
            for (int j = 0; j < initial.length(); j++) {
                if (j != 0) {
                    if (map.get(Character.toString(initial.charAt(j))).charAt(0)
                            ==
                            map.get(Character.toString(initial.charAt(j - 1))).charAt(0)) {
                        fin += " ";
                    }
                    fin += map.get(Character.toString(initial.charAt(j)));
                }else {
                    fin += map.get(Character.toString(initial.charAt(j)));
                }
            }
            System.out.println("Case #" + (i + 1) + ": " + fin);
        }
    }
}
