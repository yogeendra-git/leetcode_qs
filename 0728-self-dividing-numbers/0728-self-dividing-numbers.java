class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res=new ArrayList<>();
        for(int n=left;n<=right;n++){
            if(selfdivide(n)){
                res.add(n);
        }

        }return res;
        
    }
    private boolean selfdivide(int n){
        int num=n;
        while(num>0){
            int digit=num%10;
            if(digit==0 || n%digit!=0){
                return false;
            }
            num/=10;
        }
        return true;
    }
}