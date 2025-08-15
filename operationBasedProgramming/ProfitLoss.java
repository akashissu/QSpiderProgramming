package operationBasedProgramming;

public class ProfitLoss {
    public static void main(String[] args) {
    int cp = 120;
    int sp = 160;

    int profit = (sp-cp);

    double profitpercentage = ((double) profit / cp) * 100;

    System.out.println("Your Profit is"+profitpercentage);
        
    }
}
