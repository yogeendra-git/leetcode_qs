class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> dup=new HashSet<>();
        for(int num:nums){
            if(dup.contains(num)){
                return num;
            }
            dup.add(num);
        }return -1;
    }
}