package r;

import java.util.Scanner;

public class RationalSequence3 {
        public static void main(String[] arghMeMateys) {
            Scanner console = new Scanner(System.in);
            int cases = console.nextInt();
            for(int k = 0;k<cases;k++) {
                int caseNum = console.nextInt();
                int position = console.nextInt();
                String number = numberAtPosition(position);
                System.out.println(caseNum+" "+number);
            }
        }

        public static String numberAtPosition(int position) {
            if(position==1) {
                return"1/1";
            }

            int power =0;
            while(Math.pow(2, power)<=position) {
                power++;
            }
            power--;

            int posAtDepthX = (int)(position-Math.pow(2, power));

            String binaryPath = Integer.toBinaryString(posAtDepthX);

            int numZeros = (power)-binaryPath.length();
            String zeros = "";
            for(int i = 0;i<numZeros;i++) {
                zeros+="0";
            }

            binaryPath = zeros+binaryPath;



            String datLittleShit = "1/1";
            for(int i =0;i<binaryPath.length();i++) {
                String[] nums = datLittleShit.split("/");
                int p = Integer.parseInt(nums[0]);
                int q = Integer.parseInt(nums[1]);
                if(binaryPath.charAt(i)=='0') {
                    datLittleShit = p+"/"+(p+q);
                }else {
                    datLittleShit = (p+q)+"/"+q;
                }
            }
            return datLittleShit;
        }

    }
    class Origin {


        public static void printDepthOf(int depth) {
            String start = "";
            System.out.print("1");
            for(int x = 0;x<depth;x++) {
                String[] numbers = start.split(" ");
                for(String s:numbers) {
                    System.out.printf("%-4s",s);
                }
                System.out.println();
                //System.out.println();
                start = "";
                for(int i = 0;i<numbers.length;i++) {
                    if(i==numbers.length-1) {
                        start+=numbers[i];
                        if(numbers.length==1) {
                            start+="1 2 1";
                        }
                    }else {
                        start+=numbers[i]+" ";
                        start+=(Integer.parseInt(numbers[i])+Integer.parseInt(numbers[i+1]))+" ";
                    }

                }
                //System.out.println(start);
            }
        }

        public static void printPathOf(int position) {
            if(position==1) {
                System.out.println("root position 1/1");
                return;
            }

            int power =0;
            while(Math.pow(2, power)<=position) {
                power++;
            }
            power--;

            int posAtDepthX = (int)(position-Math.pow(2, power));

            String binaryPath = Integer.toBinaryString(posAtDepthX);

            int numZeros = (power)-binaryPath.length();
            String zeros = "";
            for(int i = 0;i<numZeros;i++) {
                zeros+="0";
            }

            binaryPath = zeros+binaryPath;

            System.out.println(binaryPath);

            for(int i = 0;i<binaryPath.length();i++) {
                if(binaryPath.charAt(i)=='0') {
                    System.out.println("left");
                }else {
                    System.out.println("right");
                }
            }

            String datLittleShit = "1/1";
            for(int i =0;i<binaryPath.length();i++) {
                String[] nums = datLittleShit.split("/");
                int p = Integer.parseInt(nums[0]);
                int q = Integer.parseInt(nums[1]);
                if(binaryPath.charAt(i)=='0') {
                    datLittleShit = p+"/"+(p+q);
                }else {
                    datLittleShit = (p+q)+"/"+q;
                }
            }
            System.out.println(datLittleShit);

            /*position at the depth minus the power of two of the depth in binary from indicates the direction
             * down the tree, zero is left and one is right, do correct calculations as indicated by direction
             * down tree*/

        }
}
