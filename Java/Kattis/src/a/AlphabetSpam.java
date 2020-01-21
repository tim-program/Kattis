package a;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlphabetSpam {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.next();

        boolean found;
        double ws =0;

        Pattern p = Pattern.compile("_");
        Matcher m = p.matcher(str);
        do{
            found = m.find();
            ws++;
        }while(found);
        double wsd = (ws-1)/str.length();

        m = p.compile("[a-z]").matcher(str);
        double lc = 0;
        do{
            found = m.find();
            lc++;
        }while(found);
        double lcd = (lc-1)/str.length();

        m = p.compile("[A-Z]").matcher(str);
        double uc = 0;
        do{
            found = m.find();
            uc++;
        }while(found);
        double ucd = (uc-1)/str.length();

        System.out.printf("%n%.15f%n%.15f%n%.15f%n%.15f",wsd,lcd,ucd,1-(wsd+lcd+ucd));

    }
}
