package t;

import java.util.Scanner;

public class Trik {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String str = console.next().toLowerCase();
        int pos = 1;
        for(int i=0;i<str.length();i++){
            switch(str.charAt(i)){
                case'a':
                    if(pos==1){
                        pos++;
                    }else if(pos==2){
                        pos--;
                    }
                    break;
                case'b':
                    if(pos==2){
                        pos++;
                    }else if(pos==3){
                        pos--;
                    }
                    break;
                case'c':
                    if(pos==1){
                        pos+=2;
                    }else if(pos==3){
                        pos-=2;
                    }
                    break;
            }
        }
        System.out.println(pos);
    }
}
