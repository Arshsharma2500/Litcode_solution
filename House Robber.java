class Solution {
    public int rob(int[] nums) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < nums.length; i ++) {
            int newa = b + nums[i];
            int newb = Math.max(b, a);
            a = newa;
            b = newb;
        }
        return Math.max(a, b);
    }
}