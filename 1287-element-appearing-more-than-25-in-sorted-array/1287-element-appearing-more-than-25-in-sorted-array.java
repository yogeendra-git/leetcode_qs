class Solution {
    public int findSpecialInteger(int[] arr) {
        int n=arr.length/4;
        int ans=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);

        }
        for(int i:hm.keySet()){
            if(hm.get(i)>n){
                ans=i;
            }
        }return ans;
    }
}