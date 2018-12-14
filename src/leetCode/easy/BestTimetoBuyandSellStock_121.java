package leetCode.easy;

/**
 * @author tianqi
 * @date 2018/9/8
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 *
 * Note that you cannot sell a stock before you buy one.
 *
 * Example 1:
 *
 * Input: [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 *              Not 7-1 = 6, as selling price needs to be larger than buying price.
 * Example 2:
 *
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 * 由该题引发的思考：
 *    最初写这道题的时候想了一个大概的思路就开始动手，提交测试后发现了一个又一个没有考虑到的情况。
 * 改算法改到自己都不想看下去的地步后对题目进行了重新思考，顺便总结一下写算法的思考步骤（其实网上
 * 大佬都谈过，没经历光看确实是没意义。
 * ①对该题确定一个基本的思路，如动态规划，贪心等。
 * ②考虑按照思路进行的方式，比如该题在遍历时对大于或小于进行不同处理。
 * ③算法优化，比如该题判断了大于或小于后没必要判断另一种情况，可以直接写如何处理即可，因为多加判断
 * 会增加时间，没有意义，当时对于严谨性来说还是有意义的。
 */
public class BestTimetoBuyandSellStock_121 {

    public static int maxProfit(int[] prices) {
        if (prices.length == 0){
            return 0;
        }
        int result = 0;
        int templocation = 0;
        for (int i = 0;i<prices.length;i++){
            if (prices[i]>prices[templocation]){
                if (prices[i]-prices[templocation]>result){
                    result = prices[i]-prices[templocation];
                }
            }
            if (prices[i]<=prices[templocation]){
                templocation = i;
            }
        }
        return result;
    }
    public static void main(String[] arge){
        int[] a = {1,2};
        System.out.println(maxProfit(a));
    }
}
