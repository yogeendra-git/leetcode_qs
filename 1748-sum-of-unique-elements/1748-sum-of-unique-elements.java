class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        for(int i :nums){
            map.put(i,map.getOrDefault(i,0)+1);

        }
        for(int key:map.keySet()){
            if(map.get(key)==1){
                sum+=key;
            }
        }return sum;
    }
}