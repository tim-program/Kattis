package r;

public class RunLengthEncodingRun {
    public static void main(String[] args) {
        java.util.Scanner console = new java.util.Scanner(System.in);
        String processType = console.next();
        String msg = console.next();
        String newMsg = "";
        if(processType.compareTo("E")==0) {
            char currentChar=0;
            int letterTrain = 1;
            for(int i = 0;i<msg.length();i++) {
                if(i==0)currentChar = msg.charAt(i);
                else if(currentChar == msg.charAt(i))
                    letterTrain+=1;
                else if(currentChar != msg.charAt(i)) {
                    newMsg+=msg.charAt(i-1)+Integer.toString(letterTrain);
                    currentChar = msg.charAt(i);
                    letterTrain=1;
                }
                if(i==msg.length()-1) {
                    newMsg+=msg.charAt(i)+Integer.toString(letterTrain);
                    letterTrain = 1;
                }
            }
        }else if(processType.compareTo("D")==0) {
            for(int i = 1;i<msg.length();i+=2) {
                for(int j = 0;j<msg.charAt(i)-48;j++) {
                    newMsg+=msg.charAt(i-1);
                }
            }
        }
        System.out.println(newMsg);
    }
}
