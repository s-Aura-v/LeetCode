import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class BestTimeToBuyAndSellStock_0121 {
public static int maxProfit(int[] prices) {
        int profit = 0;
        int leftPointer = 0;
        int rightPointer = 1;

// brute force
        // for (leftPointer = 0; leftPointer < prices.length; leftPointer++) {
        //     for (rightPointer = leftPointer + 1; rightPointer < prices.length; rightPointer++) {
        //         if ((prices[rightPointer] - prices[leftPointer]) > profit) {
        //             profit = prices[rightPointer] - prices[leftPointer];
        //         }
        //     }
        // }

        for (leftPointer = 0; leftPointer < prices.length; leftPointer++) {
            for (rightPointer = leftPointer + 1; rightPointer < prices.length; rightPointer++) {
                if (prices[rightPointer] > prices[leftPointer]) {
                    profit = Math.max(profit, (prices[rightPointer] - prices[leftPointer]));
                } else {
                    leftPointer = rightPointer;
                }
            }
        }
        
        return profit;
    }

    public static void main(String[] args) {
       int[] prices = new int[]{7,1,5,3,6,4};
       System.out.println(maxProfit(prices)); // expected: 5

        int[] prices2 = new int[]{7,6,4,3,1};
        System.out.println(maxProfit(prices2)); // expected 0
//
       int[] prices3 = new int[]{1,2};
       System.out.println(maxProfit(prices3)); // expected 1

    }
}
