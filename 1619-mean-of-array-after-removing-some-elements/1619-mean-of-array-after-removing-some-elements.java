class Solution {
    public double trimMean(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        int remove=n/20;

        double sum=0;
        for(int i=remove;i<n-remove;i++){
            sum+=arr[i];
        }return sum/(n-2*remove);

    }
}