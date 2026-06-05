package challengeArray;

import java.util.Scanner;

public class findNumber2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns you want: ");
        int column = sc.nextInt();
        int[][] numArr = new int[rows][column];
        int i = 0;
        while (i < rows) {
            int j = 0;
            while(j<column){
                System.out.println("Enter elements of rows: "+ (i+1)+ "columns: " +(j+1)+ ":");
                numArr[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }
        int k = 0;
        while(k < numArr.length){
            int l = 0;
            while (l<numArr[k].length) {
                System.out.print( "["+numArr[k][l] +" ]" );
                l++;
            }
            k++;
        }
        System.out.println();
        boolean isfound = false;
        int s = 0;
        System.out.println("Enter the Number you want to search");
        int num = sc.nextInt();
        while(s<numArr.length){
            int t = 0;
            while(t<numArr[s].length){
                if(numArr[s][t] == num){
                    isfound = true;
                }
                t++;
            }
            s++;
        }

        if(isfound){
            System.out.println("Your number is Present");
        }else{
            System.out.println("your number is Not Present");
        }
    }
}
