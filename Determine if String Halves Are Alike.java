class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        char str[] = s.toCharArray();
        int n = str.length;
        int n2 = n/2;
        int i=0,j=n2,count1=0,count2=0;
        while(i<n2 && j<n){
            if(str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u'){
                count1++;
            }
            if(str[j]=='a' || str[j]=='e' || str[j]=='i' || str[j]=='o' || str[j]=='u'){
                count2++;
            }
            i++;
            j++;
        }
        if(count1==count2){
            return true;
        }
        
        return false;
    }
}