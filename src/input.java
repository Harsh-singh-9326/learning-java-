import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        System.out.println("hello world");
        int speed = 10;
        System.out.println("speed is " + speed);
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int number = input.nextInt();
        System.out.println("your number is : " + number);

        Scanner value = new Scanner(System.in);
        System.out.println("enter a word");
        String name = value.nextLine();
        System.out.println("your name is "+ name);

    }}
