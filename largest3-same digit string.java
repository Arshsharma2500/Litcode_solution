class Solution {
    public String largestGoodInteger(String num) {
          int n = num.length();
        String maxGoodInteger = "";

        for (int i = 0; i <= n - 3; i++) {
            String candidate = num.substring(i, i + 3);
            if (isGoodInteger(candidate) && candidate.compareTo(maxGoodInteger) > 0) {
                maxGoodInteger = candidate;
            }
        }

        return maxGoodInteger;
    
    }
     private static boolean isGoodInteger(String candidate) {
        return candidate.charAt(0) == candidate.charAt(1) && candidate.charAt(1) == candidate.charAt(2);
    }
}