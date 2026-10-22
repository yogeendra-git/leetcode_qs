class Solution {
    public int minOperations(int[] nums, int k) {
        int rem=0;
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        return rem=sum%k;
    }
}