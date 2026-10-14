class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                          ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                          "...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> seen=new HashSet<>();
        for(String word:words){
            StringBuilder code=new StringBuilder();
            for(char c:word.toCharArray()){
                code.append(morse[c-'a']);
            }
            seen.add(code.toString());
        }return seen.size();
    }
}