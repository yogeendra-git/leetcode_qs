class Solution {
    public String clearDigits(String s) {
        StringBuilder sb=new StringBuilder();

        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                sb.deleteCharAt(sb.length()-1);
            }
            else{
                sb.append(ch);
            }
                
            
        }return sb.toString();
    }
}