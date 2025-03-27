import java.util.Scanner;

public class FinancialToolkit 
{
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        while (true)
         {
            System.out.println("Select a calculator:");
            System.out.println("1. Mortgage Calculator");
            System.out.println("2. Investment Return Calculator");
            System.out.println("3. Savings Goal Calculator");
            System.out.println("4. Income Tax Calculator");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    MortgageCalculator.main(args);
                    break;
                case 2:
                    InvestmentReturnCalculator.main(args);
                    break;
                case 3:
                    SavingsGoalCalculator.main(args);
                    break;
                case 4:
                    IncomeTaxCalculator.main(args);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}