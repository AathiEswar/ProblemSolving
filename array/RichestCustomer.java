package ProblemSolving.array;

public class RichestCustomer {
    /* You are given an m x n integer grid accounts where accounts[i][j]
     is the amount of money the i​​​​​​​​​​​th​​​​
     customer has in the j​​​​​​​​​​​th​​​​ bank.
     Return the wealth that the richest customer has. */
    class Solution {

        public int sumOfArray(int[] nums){
            int sum = 0;
            for(int num : nums){
                sum+=num;
            }
            return sum;
        }

        public int maximumWealth(int[][] accounts) {


            int money = 0;
            for(int i = 0;i<accounts.length ; i++){
                int sumMoney = sumOfArray(accounts[i]);
                if(money < sumMoney  ){

                    money = sumMoney;
                }
            }

            return money;
        }
    }
}
