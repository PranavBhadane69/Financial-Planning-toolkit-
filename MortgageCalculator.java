import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter loan term (in years): ");
        int loanTermInYears = scanner.nextInt();

        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int numberOfPayments = loanTermInYears * 12;

        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

        System.out.printf("Monthly mortgage payment: %.2f\n", monthlyPayment);
    }
}