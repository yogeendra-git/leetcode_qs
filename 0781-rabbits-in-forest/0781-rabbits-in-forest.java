class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer,Integer> map=new HashMap<>();
        int res=0;

        for(int x:answers){
            if(!map.containsKey(x)||map.get(x)==0){
                res +=x+1;
                map.put(x,x);
            }
            else{
                map.put(x,map.get(x)-1);
            }
        }return res;
    }
}