class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> visit=new HashSet<>();
        int x=0;
        int y=0;
        visit.add(x+","+y);
        for(char ch:path.toCharArray()){
            if(ch=='N') y++;
            else if(ch=='S') y--;
            else if(ch=='E') x++;
            else if(ch=='W') x--;
            String position =x+","+y;
            if(visit.contains(position)){
                return true;
            }
            visit.add(position);
        }return false;
    }
}