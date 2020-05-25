package n;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NoDuplicates {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        Pattern p = Pattern.compile("[a-zA-Z]{1,}");
        Matcher m = p.matcher(console.nextLine());
        boolean bool = m.find();
        do{
            list.add(m.group());
            bool = m.find();
        }while(bool);
        for(int i = 0;i<list.size();i++){
            if(i<list.size()-1){
                for(int j=i+1;j<list.size();j++){
                    if(list.get(i).compareTo(list.get(j))==0){
                        System.out.println("no");
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println("yes");
    }
}
