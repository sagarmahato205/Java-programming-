import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter the number: ");
        int num = sc.nextInt();
        int newNum = 0;
        while(num>0){
            int digit = num%10;
            newNum =newNum* 10 + digit;
            num /= 10; 
        }
        System.out.println("your reverse number is: "+ newNum);
    }
}
