class Solution {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        Arrays.sort(nums);
        for(int i:nums){
            arr.add(i*i);
        }
        Collections.sort(arr);
        int [] res=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            res[i]=arr.get(i);

        }
        return res;

        
    }
}