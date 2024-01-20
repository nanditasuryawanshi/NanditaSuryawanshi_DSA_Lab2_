/*
PayMoney. processes thousands of transactions daily amounting to crores of Rupees.
They also have a daily target that they must achieve. Given a list of transactions done by
PayMoney and a daily target, your task is to determine at which transaction PayMoney
achieves the same. If the target is not achievable, then display the target is not achieved.

Enter the size of the transaction array:
3
Enter the values of the array:
20
12
31
Enter the total number of targets that need to be achieved:
2
Enter the value of target:
21
Target achieved after 2 transactions
Enter the value of target:
19
Target achieved after 1 transactions
 */


import java.util.Scanner;

public class PayMoneyTransactions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the transaction array
        System.out.println("Enter the size of the transaction array:");
        int size = scanner.nextInt();

        // Input the values of the array
        System.out.println("Enter the values of the array:");
        int[] transactions = new int[size];
        for (int i = 0; i < size; i++) {
            transactions[i] = scanner.nextInt();
        }

        // Input the total number of targets that need to be achieved
        System.out.println("Enter the total number of targets that need to be achieved:");
        int totalTargets = scanner.nextInt();

        // Input and check each target
        for (int targetCount = 1; targetCount <= totalTargets; targetCount++) {
            System.out.println("Enter the value of target:");
            int targetValue = scanner.nextInt();

            // Check if the target is achieved
            int currentSum = 0;
            int transactionCount = 0;

            while (currentSum < targetValue && transactionCount < size) {
                currentSum += transactions[transactionCount];
                transactionCount++;
            }

            if (currentSum >= targetValue) {
                System.out.println("Target achieved after " + transactionCount + " transactions");
            } else {
                System.out.println("Target is not achieved");
            }
        }

        scanner.close();
    }
}
