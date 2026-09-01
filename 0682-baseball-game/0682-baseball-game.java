class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack<>();
        for(String o:operations){
            if(o.equals("+")){
                int sum=s.get(s.size()-1)+s.get(s.size()-2);
                s.push(sum);
            }
            else if(o.equals("D")){
                int sum=2*s.peek();
                s.push(sum);
            }
            else if(o.equals("C")){
                s.pop();
            }
            else{
                s.push(Integer.parseInt(o));
            }
        }int sum=0;
        for(int i:s){
            sum+=i;
        }
        return sum;
    }
}