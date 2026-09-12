class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> h=new HashSet<>();
        for(char ch:s.toCharArray()){
            if(h.contains(ch)){
                return ch;
            }
            h.add(ch);
        }return ' ';
    }
}