class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> fr=new HashMap<>();

        for(int num:arr){
            fr.put(num,fr.getOrDefault(num,0)+1);
        
        }
        int ans=-1;
        for(int num:fr.keySet()){
            if(fr.get(num)==num){
                ans=Math.max(ans,num);
            }
        }return ans;
    }
}