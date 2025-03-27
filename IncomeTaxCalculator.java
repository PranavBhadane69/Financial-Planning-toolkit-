import java.util.Scanner;

public class IncomeTaxCalculator
 {
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter annual income: ");
        double annualIncome = scanner.nextDouble();

        System.out.print("Enter deductions: ");
        double deductions = scanner.nextDouble();

        System.out.print("Enter filing status (single/married): ");
        String filingStatus = scanner.next();

        double taxableIncome = annualIncome - deductions;
        double taxLiability = calculateTax(taxableIncome, filingStatus);

        System.out.printf("Estimated tax liability: %.2f\n", taxLiability);
    }

    private static double calculateTax(double income, String status)
     {
        double tax = 0;
        if (status.equalsIgnoreCase("single"))
         {
            if (income <= 9875) {
                tax = income * 0.10;
            } else if (income <= 40125) {
                tax = 987.50 + (income - 9875) * 0.12;
            } else if (income <= 85525) {
                tax = 4617.50 + (income - 40125) * 0.22;
            } else if (income <= 163300) {
                tax = 14605.50 + (income - 85525) * 0.24;
            } else if (income <= 207350) {
                tax = 33271.50 + (income - 163300) * 0.32;
            } else if (income <= 518400) {
                tax = 47367.50 + (income - 207350) * 0.35;
            } else {
                tax = 156235 + (income - 518400) * 0.37;
            }
        } 
        else if (status.equalsIgnoreCase("married")) 
        {
            if (income <= 19750)
            {
                tax = income * 0.10;
            }
             else if (income <= 80250) 
            {
                tax = 1975 + (income - 19750) * 0.12;
            }
             else if (income <= 171050) 
            {
                tax = 9235 + (income - 80250) * 0.22;
            } 
            else if (income <= 326600) 
            {
                tax = 29211 + (income - 171050) * 0.24;
            }
             else if (income <= 414700)
         {  
                tax = 66543 + (income - 326600) * 0.32;
            } else if (income <= 622050) {
                tax = 94735 + (income - 414700) * 0.35;
            } else {
                tax = 167307.50 + (income - 622050) * 0.37;
            }
        }
        return tax;
    }
}