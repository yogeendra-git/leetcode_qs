class Solution {
    public int largestAltitude(int[] gain) {
        int altitude=0;
        int maxalti=0;
        for(int i=0;i<gain.length;i++){
            altitude+=gain[i];
            maxalti=Math.max(maxalti,altitude);
        }
        return maxalti;
    }
}