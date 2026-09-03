class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] visit=new boolean[n];
        Queue<Integer> q=new LinkedList<>();

        q.offer(0);
        visit[0]=true;
        while(!q.isEmpty()){
            int current=q.poll();
            for(int key:rooms.get(current)){
                if(!visit[key]){
                    visit[key]=true;
                    q.offer(key);
                }
            }
        }for(boolean room:visit){
            if(room==false) return false;

        }return true;

    }
}