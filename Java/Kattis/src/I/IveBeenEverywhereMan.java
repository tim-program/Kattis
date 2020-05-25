package I;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IveBeenEverywhereMan {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int iter = console.nextInt();
        int[] ia = new int[iter];
        Set set = new HashSet();
        for(int i =0;i<iter;i++){
            for(int iter2 = console.nextInt();iter2>0;iter2--){
                set.add(console.next());
            }
            ia[i] = set.size();
            set.clear();
        }
        for(int i:ia){
            System.out.println(i);
        }
    }
}
