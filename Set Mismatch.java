class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int ans[] = new int[2];
        Arrays.sort(nums);
       
        int arr[] = new int[nums[n-1]+1];
        
        
        for(int i=0;i<n;i++){
            arr[nums[i]] += 1;
        }
        int flag = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>1){
                ans[0]=i;
            }
            if(arr[i]<1){
                ans[1]=i;
            }
            if(arr[i]==0){
                flag = 1;
            }
            
        }
        if(flag == 0){
            if(nums[0]==1){
                ans[1]=nums[n-1]+1;
            }
            else{
                ans[1]=nums[0]-1;
            }
        }
        return ans;
    }
}