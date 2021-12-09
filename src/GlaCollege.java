/*
At GLA College of  Programming, the final school fees to be paid is calculated as follows.
•	Original Fees should be greater than or equal to R50 000
•	Minimum fixed deposit of R10 000
•	If a deposit is greater than pr equal to half the original fees, you get a 5% discount from the original fees
•	Final total fees will also include the following
1.	School Levy is 10% of original fees
2.	Sports fee is 5% of the original fees.
Write a program the calculates the final total fees to be paid.

Program must request user to enter original fees value greater then R50 000.
Program should also request user to enter amount to deposit before calculating final total fees.
 */
import java.util.Scanner;

public class GlaCollege {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double originalFees = 0;
        while (originalFees < 50000) {
            System.out.print("Original fees(min R50000): ");
            originalFees = in.nextDouble();
        }
        double deposit = 0;
        while (deposit < 10000) {
            System.out.print("Deposit(min R10000): ");
            deposit = in.nextDouble();
        }
        double discount = 0;
        if (deposit >= originalFees / 2) {
            discount = originalFees * 0.05;
        }
        System.out.println("Final total fees: R" + (originalFees + originalFees * 0.1 + originalFees * 0.05 - deposit - discount));

    }
}
