package w;

import java.util.Scanner;

public class WeakVertices {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        while(true){
            int size = console.nextInt();
            if(size == -1){
                break;
            }
            int[][] adjMatrix = new int[size][size];
            boolean[][] greyNodes = new boolean[size][size];

            for(int i = 0; i < size; i++){
                for(int j = 0; j< size;j++){
                    adjMatrix[i][j] = console.nextInt();
                }
            }


        }
    }
}
