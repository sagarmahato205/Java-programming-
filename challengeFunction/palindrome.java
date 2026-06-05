import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");
        int num = sc.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if(isPalindrome){
            System.out.println("Your number is palindrome");
        }else{
            System.out.println("your number is not Palindrome");
        }
    }
    public static boolean isPalindrome(int num){
        int reverse = reverse(num);
        return num == reverse ;
    }
    public static int reverse(int num){
        int newNum = 0;
        while(num>0){
            int digit = num %10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
