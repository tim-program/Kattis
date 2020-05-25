package h;

import java.util.Scanner;

public class HeirsDilemma {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int min = console.nextInt(),max = console.nextInt();

        //so a new char sequence isn't create through each iteration
        CharSequence zero = "0".subSequence(0, 1);
        //value holder
        int numOfCombs = 0;

        //iterates through all possible combinations with the
        //given range
        for(int i = min;i<=max;i++) {
            if(Integer.toString(i).contains(zero)) {
                continue;
            }else if(!allDifferent(i)) {
                continue;
            }else if(!allDivisible(i)) {
                continue;
            }
            numOfCombs++;
        }
        System.out.println(numOfCombs);
    }

    static boolean allDifferent(int num) {
        char[] allDigits = Integer.toString(num).toCharArray();
        java.util.Arrays.sort(allDigits);
        for(int i = 1;i<allDigits.length;i++) {
            if(allDigits[i-1]==allDigits[i]) {
                return false;
            }
        }
        return true;
    }

    static boolean allDivisible(int num) {
        char[] allDigits = Integer.toString(num).toCharArray();
        for(int i = 0;i<allDigits.length;i++) {
            //ascii values from 1-9 are 49-57
            int currentD = ((int)allDigits[i])-48;
            if(num%currentD!=0) {
                return false;
            }
        }
        return true;
    }
}
