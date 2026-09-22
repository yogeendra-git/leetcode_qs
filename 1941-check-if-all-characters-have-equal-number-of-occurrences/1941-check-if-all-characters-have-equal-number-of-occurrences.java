class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch :s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int firstcount=map.values().iterator().next();
        for(int count:map.values()){
            if(count !=firstcount){
                return false;
            }
        }
            
        return true;
    }
}