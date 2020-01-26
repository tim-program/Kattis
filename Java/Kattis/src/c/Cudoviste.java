package c;

import java.util.Scanner;

public class Cudoviste {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int rows = console.nextInt();
        int columns = console.nextInt();
        char[][] area = new char[rows][columns];
        for(int i = 0;i<rows;i++) {
            String line = console.next();
            for(int j = 0;j<columns;j++) {
                area[i][j] = line.charAt(j);
            }
        }

        int[] carsCrushed = new int[5];
        //index 0 = zeroCars... (and so on)

        CharSequence building = "#";
        CharSequence car = "X";
        for(int i = 0;i<rows-1;i++) {
            for(int j = 0;j<columns-1;j++) {
                char[] space = {area[i][j],
                        area[i+1][j],
                        area[i][j+1],
                        area[i+1][j+1]};
                String spaceStr = new String(space);
                if(spaceStr.contains(building))continue;


                int numCars = 0;
                for(int h = 0;h<spaceStr.length();h++) {
                    if(spaceStr.charAt(h)=='X')
                        numCars++;
                }

                carsCrushed[numCars]++;


            }
        }

        for(int x:carsCrushed) {
            System.out.println(x);
        }
    }
}