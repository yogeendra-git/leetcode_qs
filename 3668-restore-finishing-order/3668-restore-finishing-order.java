class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] res=new int[friends.length];
        int index=0;
        for(int i:order){
            for(int j:friends){
                if(i==j){
                    res[index++]=i;
                    break;
                }
            }
        }return res;
    }
}