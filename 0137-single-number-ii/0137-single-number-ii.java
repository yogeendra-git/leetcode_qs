class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        int two=0;
        for (int i:nums){
            res=(res^i) & ~two;
            two=(two^i) & ~res;
        }
        return res;
    }
}