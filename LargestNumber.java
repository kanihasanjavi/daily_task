<<<<<<< HEAD
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        int largest;
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }
        System.out.println("The largest number is: " + largest);
        scanner.close();
    }
}
=======

import java.util.Scanner;
public class LargestNumber{
public static void main(String args[]){
Scanner scanner=new Scanner(System.in);
System.out.println("the number is :");
int a=scanner.nextInt();
System.out.println("the number is :");
int b=scanner.nextInt();
System.out.println("the number is :");
int c=scanner.nextInt();
if(a>=b&&a<=c){
System.out.println("the largest number is :"+a);
}
else if(a>=b&&a>=c){
System.out.println("the largest number is :"+b);
}
else{
System.out.println("the largest number is :"+c);
}
scanner.close();
}
}
>>>>>>> e212ebf (the file tracked)
