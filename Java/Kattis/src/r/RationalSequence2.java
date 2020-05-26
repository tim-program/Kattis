package r;

import java.util.Scanner;

public class RationalSequence2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int cases = console.nextInt();
        for(int i = 0;i<cases;i++) {
            int caseNum = console.nextInt();
            String[] nums = console.next().split("/");
            int p = Integer.parseInt(nums[0]);
            int q = Integer.parseInt(nums[1]);
            int numCalculations = 0;
            String binaryPosition = "";
            if(p==1&&q==1) {
                System.out.println(caseNum+" "+1);
            }else {
                while(!(q==p&&q==1)) {
                    if(p>q) {
                        p-=q;
                        binaryPosition="1"+binaryPosition;
                    }else {
                        q-=p;
                        binaryPosition = "0"+binaryPosition;
                    }
                    numCalculations++;
                }


                int depthPosition = Integer.parseInt(binaryPosition,2);
                System.out.println(caseNum+" "+(int)(depthPosition+Math.pow(2, numCalculations)));

            }
        }
    }


}
