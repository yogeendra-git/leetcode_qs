class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int less=0;
        int equal=0;
        for(int i:nums){
            if(i<target){
                less++;
            }
            else if(i==target){
                equal++;
            }
        }
        List<Integer> res=new ArrayList<>();
        for(int x=0;x<equal;x++){
            res.add(less+x);
        }return res;
        
    }
}