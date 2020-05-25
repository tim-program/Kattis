package d;

import java.util.Scanner;

public class DetailedDifferences {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        for(int i = console.nextInt();i>0;i--){
            String str1 = console.next();
            String str2 = console.next();
            String res = "";
            for(int iter = 0;iter<str2.length();iter++){
                if(str1.charAt(iter)==str2.charAt(iter)){
                    res+='.';
                }else{
                    res+='*';
                }
            }
            System.out.println(str1+"\n"+str2+"\n"+res);
        }
    }
}
