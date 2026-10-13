class Solution {
    public boolean judgeSquareSum(int c) {
        long sum=0;
        long left=0;
        long right=(long) Math.sqrt(c);
        while(left<=right){
            sum=left*left+right*right;
            if(sum==c){
                return true;
            }
            else if(sum<c){
                left++;
            }
            else{
                right--;
            }
        }return false;
    }
}