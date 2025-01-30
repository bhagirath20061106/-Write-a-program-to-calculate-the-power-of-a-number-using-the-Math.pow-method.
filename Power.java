package bhagirath;
import java.util.Scanner;
public class Power{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base: ");
        double b = scanner.nextDouble(); 
        System.out.print("Enter the exponent: ");
        double exp = scanner.nextDouble();
        double result = Math.pow(b, exp);
        System.out.println(b+ " raised to the power of " + exp+ " is: " + result);
        scanner.close();
    }
}
