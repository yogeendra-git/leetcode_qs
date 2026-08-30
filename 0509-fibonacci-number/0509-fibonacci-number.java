class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        for(int i=2;i<=n;i++){
            return fib(n-1)+fib(n-2);
        }
        return fib(n);
    }
}