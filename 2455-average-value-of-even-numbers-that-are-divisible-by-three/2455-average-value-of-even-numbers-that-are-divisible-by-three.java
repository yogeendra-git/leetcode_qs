class Solution {
    public int averageValue(int[] nums) {
        int sum=0;
        int value=0;
        for(int i:nums){
            if(i%2==0 && i%3==0){
                sum+=i;
                value++;
            }
            
            
        }if(value==0){
                return 0;
        } 
        return sum/value;
    }
}