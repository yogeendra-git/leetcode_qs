class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int max=-1;
        int ans =Integer.MAX_VALUE;
        for(int d:divisors){
            int count=0;
            for(int n:nums){
                if(n%d==0){
                    count++;
                }
            }
            if(count>max){
                max=count;
                ans=d;
            }
            else if(count==max&& d<ans){
                ans=d;
            }
        }
        return ans;
    }
}