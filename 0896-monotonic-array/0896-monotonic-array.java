class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean in=true;
        boolean dec=true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                in=false;

            }
            if(nums[i]>nums[i-1]){
                dec=false;
            }
            
        }return in||dec;
    }
}