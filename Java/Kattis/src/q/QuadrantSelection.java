package q;

import java.util.Scanner;

public class QuadrantSelection {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt(), y=console.nextInt();
        if(x<0&&y<0){
            System.out.println(3);
        }else if(x>0&&y>0){
            System.out.println(1);
        }else if(x>0&&y<0){
            System.out.println(4);
        }else{
            System.out.println(2);
        }
    }
}
