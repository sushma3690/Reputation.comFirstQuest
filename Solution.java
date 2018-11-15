public class Solution {
	
	/***
	 * Method to find max profit by buying and selling one share,
	 * takes input as an array of prices.
	 * @param prices
	 * @return
	 */
    public static int maxProfit(int[] prices) {
        
     
    	/***
    	 * We are initialising the max profit as 0
    	 */
        int max = 0;
        
       /***
        * prev variable is used to calculate the diff between todays price and yesterdays price of the stock starting
        * startfing from day 1 and then if its greater than max will update max 
        * For example::
        * 7,1,5,3,6,4
        * we will start from second day and check the difference in rate with first day
        * for third day we will do it for first and second days and so on and keep udpating the max
        * Finally this method will return the maximum value in entirety.
         */
        int prev = 0;
        
        /*
         * This loop is for iterating the main input array
         */
        for(int i = 1; i < prices.length; i++ ){
            int k = i-1;
            
            /**
             * This loop is for checking difference of prices with all previous days with the current day
             * and updating the max
             */
            for(int j = 0; j < i; j++){
                if(k >= 0){
                prev = prices[i]-prices[k];
                    if(prev > max){
                        max = prev;
                    }
                     k--;
                }
               
            }
        }
        
        return max;
    }
	
	public static void main(String[] args){
		System.out.println("Positive test case "+ maxProfit(new int[] {7,1,5,3,6,4}));
		System.out.println("Negative test case "+ maxProfit(new int[] {7,6,4,3,1}));		
		
	}
	
}
