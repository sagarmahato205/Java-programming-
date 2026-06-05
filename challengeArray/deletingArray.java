package challengeArray;

import java.util.Scanner;

public class deletingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,5,3,2,4,5,3};
        int delete = sc.nextInt();
    

        //NO of Occurance
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            System.out.print("{ " + arr[i] +"}");

            if(arr[i]==delete){
                count++;
            }
        }
        System.out.println();

        int[] newArr = new int[arr.length - count];
        int j = 0;
         // Copy element From the array

         for(int i = 0 ; i<arr.length;i++){
            if(arr[i] != delete){
                newArr[j] = arr[i];
                j++;
            }
         }

         //Print remaining elements of the Array

         for(int i = 0;i<newArr.length;i++){
            System.out.print("{ " + newArr[i] +"}");
         }
    }
}
