import java.util.Scanner;

public class SavingsGoalCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter savings goal amount: ");
        double savingsGoal = scanner.nextDouble();

        System.out.print("Enter time frame (in years): ");
        int timeFrameInYears = scanner.nextInt();

        System.out.print("Enter expected annual rate of return (in %): ");
        double annualRateOfReturn = scanner.nextDouble();

        double monthlyRateOfReturn = annualRateOfReturn / 100 / 12;
        int numberOfMonths = timeFrameInYears * 12;

        double monthlySavings = savingsGoal * monthlyRateOfReturn /
                (Math.pow(1 + monthlyRateOfReturn, numberOfMonths) - 1);

        System.out.printf("Monthly savings needed: %.2f\n", monthlySavings);
    }
}