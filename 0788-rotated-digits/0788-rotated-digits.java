class Solution {
    public int rotatedDigits(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(isgood(i)){
                count++;
            }
        }return count;
    }
    private boolean isgood(int n){
        boolean changed=false;
        while(n>0){
            int digit=n%10;
            if(digit==3||digit==4||digit==7){
                return false;
            }
            if(digit==2||digit==5||digit==6||digit==9){
                changed=true;
            }
            n/=10;
        }return changed;
    }
}