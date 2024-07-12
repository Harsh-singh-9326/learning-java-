import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your age");
        int age = input.nextInt();
        if (age >18){
            System.out.println("your a adult");
        } else if (age == 18) {
            System.out.println("you just qualified now happy  ");
        } else{
            System.out.println("your a kid get lost  ");
        }
    }
}
