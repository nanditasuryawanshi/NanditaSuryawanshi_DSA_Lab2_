/*
Question Marks (12 )
You are a traveler and traveling to a country where the currency denominations are
unknown and as you travel you get to know about the denomination in random order.
You want to make a payment of amount x, in such a way that the higher denomination is
used to make exact payment.
Input
Take input of all the currency denominations ( random order)
Take input of the amount that you want to pay.
Output
Print the minimum no of notes that you will be using to pay the net amount.

output:

enter the size of currency denominations
3
enter the currency denominations value
5
1
10
enter the amount you want to pay
12
Your payment approach in order to give min no of notes will be
10:1
1:2

*/




import java.util.Arrays;
import java.util.Scanner;

public class CurrencyPayment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of currency denominations
        System.out.println("Enter the size of currency denominations:");
        int size = scanner.nextInt();

        // Input the currency denominations values
        System.out.println("Enter the currency denominations values:");
        int[] denominations = new int[size];
        for (int i = 0; i < size; i++) {
            denominations[i] = scanner.nextInt();
        }

        // Sort denominations in descending order
        Arrays.sort(denominations);
        reverseArray(denominations);

        // Input the amount you want to pay
        System.out.println("Enter the amount you want to pay:");
        int amountToPay = scanner.nextInt();

        // Calculate and print the minimum number of notes
        int remainingAmount = amountToPay;
        System.out.println("Your payment approach in order to give the minimum number of notes will be");

        for (int i = 0; i < size; i++) {
            int currentDenomination = denominations[i];
            int numberOfNotes = remainingAmount / currentDenomination;

            if (numberOfNotes > 0) {
                System.out.println(currentDenomination + ":" + numberOfNotes);
                remainingAmount %= currentDenomination;
            }
        }

        scanner.close();
    }

    // Helper method to reverse the array
    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
