class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set=new HashSet<>();
        List<Integer> arr=new ArrayList<>();
        for(int n:nums){
            set.add(n);
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                arr.add(i);
            }
        }return arr;
    }
}