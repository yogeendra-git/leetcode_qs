class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n=citations.length;
        int h=0;
        for(int i=0;i<n;i++){
            int can=Math.min(citations[i],n-i);
            h=Math.max(h,can);
        }return h;
    }
}