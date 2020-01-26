package c;
import java.util.Scanner;

public class CryptographersConundrum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int count = 0;
        String text = console.next().toLowerCase();
        for(int i=0;i<text.length()/3;i++){
            if(!(text.charAt((i*3))=='p')){
                count++;
            }
            if(!(text.charAt((i*3)+1)=='e')){
                count++;
            }
            if(!(text.charAt((i*3)+2)=='r')){
                count++;
            }
        }
        System.out.println(count);
    }
}
