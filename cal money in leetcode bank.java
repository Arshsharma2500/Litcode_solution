class Solution {
    public int totalMoney(int n) {
         int total = 0;
        int currentDay = 1;
        int currentWeek = 1;

        for (int day = 1; day <= n; day++) {
            total += currentDay;
            currentDay++;

            if (day % 7 == 0) {
                currentDay = ++currentWeek;
            }
        }

        return total;
    }
}