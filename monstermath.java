import java.util.Scanner;

public class monstermath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hello user, how much $ do you have: ");
        // Use nextDouble() to allow for cents (e.g., 50.75)
        double budget = input.nextDouble();

        // 1. Calculate Cases ($24 each, contains 12 cans)
        int numCases = (int) (budget / 24);
        double moneyAfterCases = budget % 24;

        // 2. Calculate Individual Cans ($4 each)
        int numIndivCans = (int) (moneyAfterCases / 4);
        
        // 3. Final Calculations
        int totalCans = (numCases * 12) + numIndivCans;
        double totalSpent = (numCases * 24) + (numIndivCans * 4);
        double changeLeft = budget - totalSpent;

        // Output results
        System.out.println("--- Results ---");
        System.out.println("Cases bought: " + numCases);
        System.out.println("Individual cans bought: " + numIndivCans);
        System.out.println("Total Cans: " + totalCans);
        System.out.printf("Total Spent: $%.2f%n", totalSpent);
        System.out.printf("Change Remaining: $%.2f%n", changeLeft);

        input.close();
    }
}