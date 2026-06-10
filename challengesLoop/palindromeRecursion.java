import java.util.Scanner;

public class palindromeRecursion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to palindrome");
        String str = sc.next();
        System.out.println("your String is "+(isPalindrome(str)?"palindrome":"not palindrome"));
    }
    public static boolean isPalindrome(String str){
        if(str.length() <= 1){
            return true;
        }
        int lastPos = str.length() - 1;
        if(str.charAt(0) != str.charAt(lastPos)){
            return false;

        }
        String newString = str.substring(1,lastPos);
        return isPalindrome(newString);
    }
}