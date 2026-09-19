class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int num:arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        Set<Integer> occurences=new HashSet<>(freq.values());
        return occurences.size()==freq.size();

    }
}