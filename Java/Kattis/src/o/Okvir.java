package o;

import java.util.Scanner;

public class Okvir {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while(console.hasNext()) {
            int rows = console.nextInt();
            int cols = console.nextInt();
            int up = console.nextInt();
            int left = console.nextInt();
            int right = console.nextInt();
            int down = console.nextInt();
            console.nextLine();
            char[][] res = new char[rows+up+down][cols+left+right];
            char[][] input = new char[rows][cols];
            for(int i = 0;i<rows;i++) {
                char[] inputLine = console.nextLine().toCharArray();
                for(int j = 0;j<cols;j++) {
                    input[i][j] = inputLine[j];
                }
            }


            //n to keep track of odd or even character placement
            for(int i = 0,n = 1;i<res.length;i++,n++) {
                for(int j = 0,k=1;j<res[0].length;j++,k++) {
                    if(i>=up&&i<up+rows&&j>=left&&j<left+cols) {
                        res[i][j] = input[i-up][j-left];
                    }else {
                        if(n%2 == 0) {
                            if(k%2==0) {
                                res[i][j] = '#';
                            }else {
                                res[i][j] = '.';
                            }
                        }else {
                            if(k%2==0) {
                                res[i][j] = '.';
                            }else {
                                res[i][j] = '#';
                            }

                        }

                    }
                }
            }

            for(int i = 0;i<res.length;i++) {
                for(int j = 0;j<res[0].length;j++) {
                    System.out.print(res[i][j]);
                }
                System.out.println();
            }
        }
    }
}
