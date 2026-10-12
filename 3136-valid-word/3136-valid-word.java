class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        boolean vowel=false,consonant=false;
        for(char c:word.toCharArray()){
            if(!Character.isLetterOrDigit(c)) return false;
            if(Character.isLetter(c)){
                if("aeiouAEIOU".indexOf(c)!=-1){
                    vowel=true;
                }else{
                    consonant=true;
                }
            }
        }return vowel&&consonant;
    }
}