class Solution {
    public String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--){
          char curr = num.charAt(i);
          if((curr-'0')%2!=0){
            return num.substring(0,i+1);
          }
        }
        return "";
    }
}