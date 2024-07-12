import java.util.Scanner;
public class switchlearning {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.println("enter a number to know a day ");
int value = input.nextInt();
switch (value){
    case 1:
        System.out.println("this is monday");
    break;
    case 2:
        System.out.println("this is tuesday");
        break;
    case 3:
        System.out.println("this is wednesday");
        break;
    case 4:
        System.out.println("this is thursday");
        break;
    case 5:
        System.out.println("this is friday");
        break;
    case 6:
        System.out.println("this is saturday");
        break;
    case 7:
        System.out.println("this is sunday");
        break;
    default:
        System.out.println("you input wrong value");

}
    }
}
