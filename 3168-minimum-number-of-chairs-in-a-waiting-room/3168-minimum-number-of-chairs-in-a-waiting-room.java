class Solution {
    public int minimumChairs(String s) {
        int curr=0;
        int maxchair=0;
        for(char ch:s.toCharArray()){
            if(ch=='E'){
                curr++;
                maxchair=Math.max(curr,maxchair);
            }
            else if(ch=='L'){
                curr--;
            }
        }return maxchair;
    }
}