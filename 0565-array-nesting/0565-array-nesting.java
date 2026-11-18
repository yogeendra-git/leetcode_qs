class Solution {
    public int arrayNesting(int[] nums) {
        int n=nums.length;
        boolean[] visit=new boolean[n];
        int max=0;
        for(int i=0;i<n;i++){
            if(visit[i]){
                continue;
            }
            int count=0;
            //int j=i;
            while(!visit[i]){
                visit[i]=true;
                count++;
                i=nums[i];
            }
            max=Math.max(max,count);
        }return max;
    }
}