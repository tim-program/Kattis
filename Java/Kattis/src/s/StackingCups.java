package s;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StackingCups {

        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            int iter = console.nextInt();
            Map<Integer,String> map = new HashMap<Integer,String>();
            int[] nums = new int[iter];
            for(int i = 0;i<iter;i++) {
                String s1 = console.next(),
                        s2 = console.next();
                try {
                    map.put(Integer.parseInt(s1)/2, s2);
                    nums[i]=Integer.parseInt(s1)/2;

                }catch(NumberFormatException e) {
                    map.put(Integer.parseInt(s2), s1);
                    nums[i]=Integer.parseInt(s2);
                }

            }
            Arrays.sort(nums);
            for(Integer i:nums) {
                System.out.println(map.get(i));
            }
        }
}
