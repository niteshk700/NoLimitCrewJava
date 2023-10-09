import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Calculate the sum of digits
        int sum = 0;
        int originalNumber = number; // Store the original number for display
        
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            sum += digit; // Add the digit to the sum
            number /= 10; // Remove the last digit
        }
        
        // Display the result
        System.out.println("The sum of digits in " + originalNumber + " is: " + sum);
        
        scanner.close();
    }
}
