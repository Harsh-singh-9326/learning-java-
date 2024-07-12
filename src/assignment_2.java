//take the input of an 3 angle of an triangle and check the given angle of triangle is valid or not
import java.util.Scanner;
public class assignment_2 {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.println("enter all three angle");
int a =input.nextInt();
int b = input.nextInt();
int c = input.nextInt();
 int sum = a +b + c;
     if (sum == 180 && a>0 && b>0 && c>0){
            System.out.println("this is valid triangle");
     }else{
            System.out.println("this is not valid triangle");
     }
    }
}
