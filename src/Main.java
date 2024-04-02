import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n >= 1000000) {
            System.out.println("n should be less than 1,000,000.");
            return;
        }

        LinkedList primeNumbers = new LinkedList();
        primeNumbers.populatePrimeNumbers(n);
        int sumWithThree = primeNumbers.getSumOfPrimeNumbersWithThree();
        System.out.println("Sum of prime numbers containing the digit '3' up to " + n + " is: " + sumWithThree);
    }
}
