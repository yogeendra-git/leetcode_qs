class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        Set<Integer> set3=new HashSet<>();
        for(int n:nums1){
            set1.add(n);
        }
        for(int n:nums2){
            set2.add(n);
        }
        for(int n:nums3){
            set3.add(n);
        }
        Map<Integer,Integer> count=new HashMap<>();
        for(int n:set1) count.put(n,count.getOrDefault(n,0)+1);
        for(int n:set2) count.put(n,count.getOrDefault(n,0)+1);
        for(int n:set3) count.put(n,count.getOrDefault(n,0)+1);

        List<Integer> res=new ArrayList<>();
        for(int key:count.keySet()){
            if(count.get(key)>=2){
                res.add(key);
            }
        }
        return res;
    }
}