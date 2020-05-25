package n;

import java.util.Scanner;

public class NineKnights {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        char[][] ca = new char[5][5];
        String[] sa = new String[5];
        int knights=0;
        //store in 2d char array and count knights
        for(int i = 0;i<5;i++){
            sa[i]= console.next();
            for(int j = 0;j<5;j++){
                ca[i][j] = sa[i].charAt(j);
                if(sa[i].charAt(j)=='k'){
                    knights++;
                }
            }
        }
        if(knights!=9){
            wrong();
        }


        for(int i = 0;i<5;i++){
            for(int j = 0;j<5;j++){
                if(ca[i][j]=='k')
                    if(!check(ca,i+2,j+1)|!check(ca,i+2,j-1)|
                            !check(ca,i-2,j+1)|!check(ca,i-2,j-1))
                        wrong();

            }

            right();
        }


    }
    static void wrong(){
        System.out.println("invalid");
        System.exit(0);
    }
    static void right(){
        System.out.println("valid");
        System.exit(0);
    }
    static boolean check(char[][] ca,int i,int j){
        try{
            if(ca[i][j]=='k'){
                return false;
            }
        }catch(Exception e){
            return true;
        }
        return true;



    }
}
