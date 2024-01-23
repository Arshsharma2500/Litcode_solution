class Solution {
    public int maxLength(List<String> arr) {
           return maxLengthHelper(arr, 0, new HashSet<>())/2;
    }

    private static int maxLengthHelper(List<String> arr, int index, Set<Character> charSet) {
        if (index == arr.size()) {
            return charSet.size();
        }

        // Exclude the current string
        int maxLengthWithoutCurrent = maxLengthHelper(arr, index + 1, charSet);

        // Include the current string if it has unique characters
        String currentString = arr.get(index);
        Set<Character> newCharSet = new HashSet<>(charSet);
        boolean isUnique = true;

        for (char c : currentString.toCharArray()) {
            if (newCharSet.contains(c)) {
                isUnique = false;
                break;
            }
            newCharSet.add(c);
        }

        int maxLengthWithCurrent = 0;
        if (isUnique) {
            maxLengthWithCurrent = maxLengthHelper(arr, index + 1, newCharSet) + currentString.length();
        }

        return Math.max(maxLengthWithoutCurrent, maxLengthWithCurrent);
    }
}