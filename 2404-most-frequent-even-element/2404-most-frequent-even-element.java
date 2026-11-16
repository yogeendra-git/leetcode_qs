class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(i%2==0){
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        int ans=-1;
        int max=0;
        for(int key:map.keySet()){
            int freq=map.get(key);
            if(freq>max){
                max=freq;
                ans=key;
            }
            else if(freq==max && key<ans){
                ans=key;
            }
        }
        return ans;
    }
}