class Solution {
    public int balancedStringSplit(String s) {
        int balance=0;
        int count=0;
        for(int i:s.toCharArray()){
            if(i=='R') balance++;
            else balance--;
            if(balance==0){
                count++;
            }
        }return count;

    }
}