package s;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SynchronizingLists {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        int n = io.nextInt();
        while (true) {
            int[] first = new int[n], second = new int[n];
            Map<Integer, Integer> indexMap = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int next = io.nextInt();
                indexMap.put(next, i);
                first[i] = next;
            }
            for (int i = 0; i < n; i++) {
                second[i] = io.nextInt();
            }
            Arrays.sort(first);
            Arrays.sort(second);
            int[] newSecond = new int[n];
            for (int i = 0; i < n; i++) newSecond[indexMap.get(first[i])] = second[i];
            for (int i : newSecond) System.out.println(i);
            n = io.nextInt();
            if (n == 0) break;
            else System.out.println();
        }
        io.close();
    }
}
