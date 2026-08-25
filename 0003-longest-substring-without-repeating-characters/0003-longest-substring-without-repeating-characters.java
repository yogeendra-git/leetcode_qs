class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet();
        int left=0;
        int maxlen=0;
        for(int right=0;right<s.length();right++){
            char current=s.charAt(right);
            while(set.contains(current)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(current);
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
        

        

    }
}