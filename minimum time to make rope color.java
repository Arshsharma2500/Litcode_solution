class Solution {
    public int minCost(String colors, int[] neededTime) {
        char col[] = colors.toCharArray();
        int n = col.length;      // 11
        int i=0;                 // 0
        int j=1;                 // 1
        int sum = 0;             // 0
        while(i<n && j<n){       // 01,12,23,34,45,56,67,78,89,910
            if(col[i]==col[j]){  // true.true
                if(neededTime[i]<=neededTime[j]){ //true,
                    sum += neededTime[i];  //3+5
                    i = j;
                    j++;
                }
                else{
                    sum += neededTime[j];  // 5+3+4+4+1
                    j++;
                }
            }
            else{            //
               i=j;
               j++; 
            }
        }
        return sum;
    }
}