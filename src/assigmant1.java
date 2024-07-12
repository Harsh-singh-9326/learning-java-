//take a integer value and find it is even or odd
import java.util.Scanner;
public class assigmant1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int value = input.nextInt();
        if (value%2 ==0) {
            System.out.println("it is even ");
        } else {
            System.out.println("it is odd");
        }
    }
}
