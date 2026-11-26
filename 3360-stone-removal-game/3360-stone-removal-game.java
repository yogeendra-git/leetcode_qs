class Solution {
    public boolean canAliceWin(int n) {
        int stones=10;
        boolean play =true;
        while(n>=stones){
            n-=stones;
            stones--;
            play=!play;

        }return !play;
    }
}