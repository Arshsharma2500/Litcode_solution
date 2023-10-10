class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>0)
            break;
        int j=n-1,l=i+1;
        

        while(l<j){
        int result = nums[i]+nums[l]+nums[j];
        if(result<0){
            l++;


        }
        else if(result>0){
            
            j--;

        }
        else {
           arr.add(Arrays.asList(nums[i],nums[l],nums[j]));
           while(l+1<=j && nums[l]==nums[l+1]) 
           l++;

           l++;
           j--;
        }
        }
        while(i+1<n && nums[i+1] == nums[i])
        i++;
        
        
        }
        return arr;

    }

}