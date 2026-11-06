class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> seen=new HashSet<>();
        List<Integer> dup=new ArrayList<>();

        for(int num:nums){
            if(!seen.add(num)){
                dup.add(num);
            }
        }return dup;
    }
}