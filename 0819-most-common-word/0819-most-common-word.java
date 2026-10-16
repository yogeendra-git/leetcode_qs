class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bs=new HashSet<>();
        for(String word:banned){
            bs.add(word.toLowerCase());
        }
        paragraph=paragraph.toLowerCase().replaceAll("[^a-z]"," ");
        String[] words=paragraph.split("\\s+");
        HashMap<String,Integer> hm=new HashMap<>();
        for(String word:words){
            if(bs.contains(word)){
                continue;
            }
            hm.put(word,hm.getOrDefault(word,0)+1);

        }
        String common="";
        int max=0;
        for(Map.Entry<String,Integer> entry: hm.entrySet()){
            
            if(entry.getValue()>max){
                max=entry.getValue();
                common=entry.getKey();
            }
        }
        return common;
    }
}