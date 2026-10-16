class Solution {
    public int primePalindrome(int n) {
        while(true){
            if(isprime(n) && ispal(n)){
                return n;
            }else{
                n++;
                if (10000000 < n && n < 100000000) {
                    n = 100000000;
            }
            }
            
        }

        
    }
    static boolean isprime(int n){
        if(n<2){
            return false;
        }
        if(n%2==0) return n==2;
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0){
                return false;
            }
        }return true;
    }
    static boolean ispal(int n){
        int original=n;
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        return original==rev;
    }
}