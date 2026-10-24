class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] freq=new int[10];
        while(n>0){
            int digit=n%10;
            freq[digit]++;
            n/=10;
        }
        int min=Integer.MAX_VALUE;
        int res=-1;
        for(int i=0;i<10;i++){
            if(freq[i]>0 && freq[i]<min){
                min=freq[i];
                res=i;
            }
        }return res;
    }
}