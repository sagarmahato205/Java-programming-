package Arrays;

import java.util.Scanner;

public class searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,4,5,3,6,87,54,34,76,98,67};
        System.out.print("Enter the number you want to find:");
        int num = sc.nextInt();
        boolean isFound = false;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == num){
                System.out.println("Your number "+ arr[i]+"  is at index: " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Your number is not in the list");
        }
    }
}
