//To check whether the triangle is  equilateral isocoles or scalene
//for help :-Equilateral Triangle: All three sides are equal.
//Isosceles Triangle: At least two sides are equal.
//Scalene Triangle: All three sides are different

import java.util.Scanner;
public class assignment5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("given all 3 side of triangle");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
     if ((a==b)&&(b==c)&&(a==c)){
    System.out.println("it is equilateral");
    } else if ((a==b)||(b==c)||(a==c)) {
         System.out.println("it is Isosceles");
}else {
         System.out.println("it is Scalene "); }
    }}



