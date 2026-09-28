class Solution {
    public int maxDepth(String s) {
        int depth=0;
        int maxdepth=0;
        for(char ch :s.toCharArray()){
            if(ch=='('){
                depth++;
                maxdepth=Math.max(depth,maxdepth);

            }
            else if(ch==')'){
                depth--;
            }
        }return maxdepth;
    }
}