class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxsum=0;
        for(int[] customer:accounts){
            int sum=0;
            for(int money:customer){
                sum+=money;
            }
            if(sum>maxsum){
                maxsum=sum;
            }
        }return maxsum;
    }
}