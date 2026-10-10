class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res=new ArrayList<>();
        String digits="123456789";
        for(int len=2;len<=9;len++){
            for(int st=0;st+len<=9;st++){
                int num=Integer.parseInt(digits.substring(st,st+len));
                if(num>=low && num<=high){
                    res.add(num);
                }
            }
        }Collections.sort(res);
        return res;
    }
}