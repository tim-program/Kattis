package d;

import java.util.Scanner;

public class DRMMessages {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String enMsg = console.next();

        //works with case EWPGAJRB and UEQBJPJCBUDGBNKCAHXCVERXUCVK
        String[] dividedMsgs = divideMessage(enMsg);
        //works with case EWPGAJRB and UEQBJPJCBUDGBNKCAHXCVERXUCVK
        String[] rotatedMsgs = {rotateMessage(dividedMsgs[0]),rotateMessage(dividedMsgs[1])};
        //works with case EWPGAJRB and UEQBJPJCBUDGBNKCAHXCVERXUCVK
        String deMsg = mergeMessages(rotatedMsgs[0],rotatedMsgs[1]);

        System.out.println(deMsg);
    }

    static String[] divideMessage(String msg) {
        int midIndex = msg.length()/2;
        String[] result = {msg.substring(0, midIndex),msg.substring(midIndex)};
        return result;
    }

    static String rotateMessage(String msg) {
        int rotationValue = 0;
        for(int i = 0;i<msg.length();i++) {
            rotationValue+=((int)msg.charAt(i))-65;
        }
        String rotatedMsg = "";
        for(int i = 0;i<msg.length();i++) {
            int charValue = msg.charAt(i)+rotationValue;
            while(charValue>90) {
                charValue-=26;
            }
            rotatedMsg+=(char)charValue;
        }
        return rotatedMsg;
    }

    static String mergeMessages(String msg,String key) {
        String decryptedMessage = "";
        for(int i = 0;i<msg.length();i++) {
            int charValue = msg.charAt(i)+(key.charAt(i)-65);
            while(charValue>90) {
                charValue-=26;
            }
            decryptedMessage+=(char)charValue;
        }
        return decryptedMessage;
    }
}
