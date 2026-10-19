class Solution {
    public String reverseVowels(String s) {
        char []arr=s.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<right){
            while(left<right && !isVowel(arr[left])) left++;
            while(left<right && !isVowel(arr[right])) right--;
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;

        }
        return new String(arr);
    }
    static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
}