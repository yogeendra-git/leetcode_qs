class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int max=0;
        for(int num=lowLimit;num<=highLimit;num++){
            int box=digit(num);
            hm.put(box,hm.getOrDefault(box,0)+1);
            max=Math.max(max,hm.get(box));
        }
        return max;
        
    }
    private int digit(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}