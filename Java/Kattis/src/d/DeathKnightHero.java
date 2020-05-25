package d;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeathKnightHero {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int won = 0;
        Pattern patter = Pattern.compile("cd");

        for(int iter =console.nextInt();iter>0;iter--){
            Matcher m = patter.matcher(console.next().toLowerCase());
            if(!m.find()){
                won++;
            }


        }
        System.out.println(won);

    }
}
