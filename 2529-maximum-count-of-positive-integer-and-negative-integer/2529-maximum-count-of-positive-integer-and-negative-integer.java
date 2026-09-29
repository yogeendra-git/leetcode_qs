class Solution {
    public int maximumCount(int[] nums) {
        int p=0;
        int n=0;
        for(int num:nums){
            if(num>0){
                p++;
            }else if(num<0){
                n++;
            }
        }
        return Math.max(p,n);
    }
}