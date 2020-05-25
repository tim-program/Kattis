package k;

import java.util.Scanner;

public class Kemija {
        static char[] loc = {'a','e','i','o','u'};
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);

            String line = console.nextLine();
            System.out.println(erase(line));
        }

        private static String erase(String line) {
            for(int i = 0;i<line.length();i++){
                if(i<=line.length()-3){
                    if(line.charAt(i)==line.charAt(i+2)&&
                            line.charAt(i+1)=='p'&&
                            charIsVowel(line.charAt(i))){
                        line = line.substring(0,i+1)+line.substring(i+3,line.length());
                    }
                }
            }
            return line;
        }

        private static boolean charIsVowel(char charAt) {
            boolean b = false;
            for(char c:loc){
                if(c == charAt){
                    b = true;
                }

            }
            return b;
        }
}
