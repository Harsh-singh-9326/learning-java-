//take a three integer value and find the biggest value of them
import java.util.Scanner;
public class assignment4 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("enter all three integer value");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if ((a>=b)&&(a>=c)){
            System.out.println("integer a is bigger " + a);
        } else if ((b>=a)&&(b>=c)) {
            System.out.println("integer b is bigger " + b);
        }else {
            System.out.println("integer c is bigger " + c);
        }


    }
}
