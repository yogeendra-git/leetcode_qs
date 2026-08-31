class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return 0;
        int hl=haystack.length();
        int nl=needle.length();
        for(int i=0;i<=hl-nl;i++){
            if(haystack.substring(i,i+nl).equals(needle)) return i;
        }return -1;        
    }
}