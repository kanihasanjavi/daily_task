import java.util.Scanner;
public class SwapNumbers {
public static void main(String[] args) {
int a,b;
Scanner scanner = new Scanner(System.in);
System.out.print("Enter first number (a): ");
a = scanner.nextInt();
System.out.print("Enter second number (b): ");
b = scanner.nextInt();
System.out.println("\nBefore Swapping:");
System.out.println("a = " + a);
System.out.println("b = " + b);
a = a + b;
b = a - b;
a = a - b;
System.out.println("\nAfter Swapping:");
System.out.println("a = " + a);
System.out.println("b = " + b);
scanner.close();
}
}