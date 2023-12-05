class Solution {
    private int sum = 0;

    public int numberOfMatches(int n) {
        if (n > 1) {
            if (n % 2 != 0) {
                int res = (n - 1) / 2;
                sum += res;
                return numberOfMatches(n - res);
            } else {
                int res = n / 2;
                sum += res;
                return numberOfMatches(n-res);
            }
        } else {
            return sum;
        }
    }
}
