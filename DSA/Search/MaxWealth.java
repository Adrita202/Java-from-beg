public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
            {1, 2, 3}, 
            {3, 2, 1}, 
            {4, 5, 6}
        };

        MaxWealth obj = new MaxWealth();
        // int result = obj.maximumWealth(accounts);
        int result = obj.maximumWealth2(accounts);
        System.out.println("Maximum Wealth = " + result);
        
    }
    public int maximumWealth(int[][] accounts){
        int ans=Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++)
        {
            int sum=0;
            for(int account=0;account<accounts[person].length;account++)
            {
                sum+=accounts[person][account];
                
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
    public int maximumWealth2(int[][] accounts) {
        int ans = Integer.MIN_VALUE;

        // loop through each customer (person)
        for (int[] person : accounts) {
            int sum = 0;

            // loop through each account balance of that person
            for (int account : person) {
                sum += account;
            }

            // update max wealth
            if (sum > ans) {
                ans = sum;
            }
        }

        return ans;
    }
}
