// take a value as a year  and find out it is leap year or not
// for guidance a year can be consider leap year if it divisibe by 4 and not divisible by 100 also divisible by 400

import java.util.Scanner;
public class assignment3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a year");
        int year = input.nextInt();
        if ((year%4==0)&&(year%100!=0)||(year%400==0)){
            System.out.println("it is leap year");
    } else{
        System.out.println("not a leap year");
    }
    }
}