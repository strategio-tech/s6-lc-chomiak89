package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * TODO: finish out this JavaDoc comment block.
     * FIXME: WHAT DOES THIS METHOD DO?
     * <p>
     *     This method takes a total loan amount, calculates and returns the amount still owed if
     *     paying 10% of the remaining loan amount each month for 3 months.
     * </p>
     * 
     * @param amount the total amount of loan owed
     * @return the amount still owed after paying off 10% of the balance each month for 3 months
     */
    static int getRemainingAmountIn3Months(int amount) {
        // TODO: Rewrite this method
        int numOfMonths = 3;
        int remainingAmount = amount;
        for (int i = 0; i < numOfMonths; i++ ) {
            remainingAmount = (remainingAmount - (int)(remainingAmount * 0.1));
        }
        return remainingAmount;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
