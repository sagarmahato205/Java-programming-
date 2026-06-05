package challengeArray;

import java.util.Scanner;

public class elementOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,5,2,3,5,3,6,9,6,7};
        int number = sc.nextInt();
        int count = 0;
        boolean isFound = false;
        for(int i = 0;i<arr.length;i++){
            if(number == arr[i]){
                count++;
                isFound = true;
            }
        }
        if(isFound){
            System.out.println("Your number is present in the array: " + count + " times");
        }else{
            System.out.println("Your number is not present in the array");
        }
    }
}
