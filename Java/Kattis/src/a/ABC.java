package a;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ABC {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Set<Integer> set = new TreeSet<>();
        set.add(console.nextInt());
        set.add(console.nextInt());
        set.add(console.nextInt());
        Object[] arr = set.toArray();
        int a = (int) arr[0], b = (int) arr[1], c = (int) arr[2];

        String str = console.next().toLowerCase();

        for(int i=0;i<3;i++){
            switch(str.charAt(i)){
                case'a':
                    System.out.print(a+" ");
                    break;
                case'b':
                    System.out.print(b+" ");
                    break;
                case'c':
                    System.out.print(c+" ");
                    break;


            }
        }
    }
}
