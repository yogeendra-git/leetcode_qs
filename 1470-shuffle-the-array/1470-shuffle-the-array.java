class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len=nums.length;
        int[] ans=new int[len];
        for(int i=0;i<len;i++){
            if(i%2==0){
                ans[i]=nums[i/2];

            }
            else{
                ans[i]=nums[n+(i/2)];
            }
        }return ans;
    }
}