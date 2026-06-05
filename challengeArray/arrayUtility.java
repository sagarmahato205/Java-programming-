package challengeArray;

import java.util.Scanner;

public class arrayUtility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of your row");
        int rows = sc.nextInt();
        System.out.println("Please enter the number of your column");
        int column = sc.nextInt();
        int numArr[][] = new int[rows][column];
        int i = 0;
        while(i<rows){
            int j = 0 ;
            while (j<column) {
                System.out.println("please enter element row:" +(i+1)+",column: "+(j+1)+":");
                numArr[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }
        // return numArr;
        
    }
}
