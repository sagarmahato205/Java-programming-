import java.util.*;
public class TrapWater {

    public static void main(String[] args) {
        int number[] = {4,2,0,6,3,2,5};
        int n = number.length;
        int leftMax[] = new int[n];
        leftMax[0] = number[0];

        //for finding leftMax array
        for(int i = 1 ; i<n;i++){
            leftMax[i] = Math.max(number[i],leftMax[i-1]);
            System.out.print("leftMax :"+leftMax[i] + ",");
        }

        //for finding rightmax array
        int rightmax[] = new int[n];
        rightmax[n-1] = number[n-1];
        for(int i = n-2; i>=0 ; i--){
            rightmax[i] = Math.max(number[i],rightmax[i]);
            System.out.print("rightMax :"+rightmax[i] + ",");

        }

        //Calculating TrappedWater
        int TrappedWater = 0;
        for(int i = 0 ; i<n ; i++){
            int waterLevel = Math.max(leftMax[i],rightmax[i]);
            // System.out.println("waterLevel :"+waterLevel + ",");

            TrappedWater += waterLevel - number[i];
            System.out.println("TrappedWater" + TrappedWater + ",");
        }
        System.out.println(TrappedWater);
    }
}