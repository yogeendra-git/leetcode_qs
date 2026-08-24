class Solution {
    public void moveZeroes(int[] nums) {
        int zeros=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=0){
                nums[zeros]=nums[i];
                zeros++;
            }
        }
        for (int i=zeros;i<nums.length;i++){
            nums[i]=0;
        }
    }
}