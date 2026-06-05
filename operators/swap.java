public class swap {

     public static void main(String [] args){
        int a = 5;
        int b = 10;
        System.out.println("value of a "+ a);
        System.out.println("value of b " + b);
        System.out.println("After swapping");
        int temp = a;
        a = b;
        b= temp;
        System.out.println("value of a: " +a);
        System.out.println("value of b: "+b);
     }
}