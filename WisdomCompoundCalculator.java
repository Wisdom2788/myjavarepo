import java.util.Scanner;

public class CompoundInterestCalculator2 {

    public static void main(String[] args) {
        
        Scanner wisdom = new Scanner(System.in);

   
        System.out.println("Enter the initial investment amount:");
        double initialInvestment = wisdom.nextDouble();

        System.out.println("Enter the monthly contribution:");
        double monthlyContribution = wisdom.nextDouble();

        System.out.println("Enter the number of years:");
        int years = wisdom.nextInt();

        System.out.println("Enter the annual interest rate (in %):");
        double interestRate = wisdom.nextDouble();

        System.out.println("Enter the interest rate variance (in %):");
        double rateVariance = wisdom.nextDouble();

        System.out.println("Enter the number of times interest is compounded per year:");
        int compoundFrequency = wisdom.nextInt();

       
       

        
        double averageResult = calculateCompoundInterest(initialInvestment, monthlyContribution, years, interestRate, compoundFrequency);
        double bestCaseResult = calculateCompoundInterest(initialInvestment, monthlyContribution, years, interestRate + rateVariance, compoundFrequency);
        double worstCaseResult = calculateCompoundInterest(initialInvestment, monthlyContribution, years, interestRate - rateVariance, compoundFrequency);

        
        System.out.println("\nResults:");
        System.out.println("Total Investment Without Interest: $" + (initialInvestment + monthlyContribution * years * 12));
        System.out.println("Average Scenario: $" + averageResult);
        System.out.println("Best Case Scenario: $" + bestCaseResult);
        System.out.println("Worst Case Scenario: $" + worstCaseResult);
    }

    
    public static double calculateCompoundInterest(double startAmount, double monthlyAdd, int totalYears, double annualRate, int frequency) {
        double rate = annualRate / 100;
        double totalAmount = startAmount;
        int months = totalYears * 12;

        for (int i = 0; i < months; i++) {
            totalAmount += monthlyAdd;
            totalAmount += (totalAmount * (rate / frequency));
        }

        return Math.round(totalAmount * 100.0) / 100.0;
    }
}