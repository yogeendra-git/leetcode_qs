class Solution {
    public int[] sortArray(int[] nums){
        int n=nums.length;
        divide(nums,0,n-1);
        return nums;
    }
    public static void divide(int[] arr,int start,int last){
            int mid=start+(last-start)/2;
            if(start>=last) return;
            divide(arr,start,mid);
            divide(arr,mid+1,last);
            conquer(arr,start,mid,last);
        }
        public static void conquer(int[] arr,int start,int mid,int last){
            int []merge=new int[last-start+1];
            int idx1=start;
            int idx2=mid+1;
            int x=0;
            while(idx1<=mid && idx2<=last){
                if(arr[idx1]<=arr[idx2]){
                    merge[x++]=arr[idx1++];
                }else{
                    merge[x++]=arr[idx2++];
                }
            }
            while(idx1<=mid){
                merge[x++]=arr[idx1++];
            }
            while(idx2<=last){
                merge[x++]=arr[idx2++];
            }
            for(int i=0,j=start;i<merge.length;i++,j++){
                arr[j]=merge[i];
            }

        }
    }