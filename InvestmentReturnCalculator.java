import java.util.Scanner;

public class InvestmentReturnCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial investment amount: ");
        double initialInvestment = scanner.nextDouble();

        System.out.print("Enter expected annual rate of return (in %): ");
        double annualRateOfReturn = scanner.nextDouble();

        System.out.print("Enter investment time horizon (in years): ");
        int investmentTimeHorizon = scanner.nextInt();

        double futureValue = initialInvestment * Math.pow(1 + annualRateOfReturn / 100, investmentTimeHorizon);

        System.out.printf("Future value of investment: %.2f\n", futureValue);
    }
}