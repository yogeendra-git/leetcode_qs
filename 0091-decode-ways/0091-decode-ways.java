class Solution {
    public int numDecodings(String s) {
        if(s.isEmpty() || s.charAt(0)=='0'){
            return 0;

        }
        int [] dp= new int[s.length()+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=s.length();i++){
            int singledigit=s.charAt(i-1)-'0';
            if (singledigit>=1 && singledigit<=9){
                dp[i]=dp[i]+dp[i-1];
            }
            int doubledigit=Integer.parseInt(s.substring(i-2,i));
            if(doubledigit>=10 && doubledigit<=26){
                dp[i]=dp[i]+dp[i-2];
            }
        }
        return dp[s.length()];
        
    }
}