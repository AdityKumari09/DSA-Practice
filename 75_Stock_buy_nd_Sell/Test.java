import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array :- ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Max profit is :- " + max_profit(arr));

        sc.close();
    }

    public static int max_profit(int[] arr)
    {
        int max_profit = 0;
        int min_price = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++)
        {
            if (min_price < arr[i])
            {
                max_profit = Math.max(max_profit, (arr[i] - min_price));
            }
            else
            {
                min_price = arr[i];
            }
        }
        return max_profit;
    }
}

/*
    Problem Statement: You are given an array of prices where prices[i] is the 
    price of a given stock on an ith day. You want to maximize your profit by 
    choosing a single day to buy one stock and choosing a different day in the 
    future to sell that stock. Return the maximum profit you can achieve from 
    this transaction. If you cannot achieve any profit, return 0.

    Input: prices = [7,1,5,3,6,4]
    Output: 5
    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), 
    profit = 6-1 = 5.
    Note: That buying on day 2 and selling on day 1 is not allowed because you 
    must buy before you sell.

*/
