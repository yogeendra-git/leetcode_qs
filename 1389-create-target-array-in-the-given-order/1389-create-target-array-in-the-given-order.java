class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            target.add(index[i],nums[i]);
        }
        int[] res=new int[target.size()];
        for(int i=0;i<target.size();i++){
            res[i]=target.get(i);

        }return res;   
    }
}