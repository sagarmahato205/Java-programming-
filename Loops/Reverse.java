package Loops;

public class Reverse {
    public static void main(String[] args) {
        int n=23456;
        while (n>0) {
            int lastdig = n%10;
            System.out.print(lastdig);
            n=n/10;
        }
        System.out.println();
    }
}
