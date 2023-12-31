class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        char c[] = s.toCharArray(); 
        int n = c.length;           
        int i=0;
        int j=n-1;
        int maxcount = -1; 
        int flag = 0;           
        while(i<n){                  
            int count = 0;           
            if(c[i]==c[j]){         
                count = j-i-1;
                i++;
                j = n-1;
                flag = 1;
                maxcount = Math.max(count,maxcount);
            }
            else{
                j--;
                if(i==j-1){
                i++;
                j=n-1;
            }
            } 
        }
        return maxcount;
    }
}