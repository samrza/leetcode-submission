class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;

        Set<Character> windowSet = new HashSet<>();  
        int left = 0;
        int right = 0;
        int maxLength = 0;

        while (right < s.length()) {
            char currentChar = s.charAt(right);

            if (!windowSet.contains(currentChar)) {
                windowSet.add(currentChar);

                int windowSize = right - left + 1;
                maxLength = Math.max(maxLength, windowSize);

                right++;
            } else {
                windowSet.remove(s.charAt(left)); // leftmost hata dega and increase by 1
                left++;
            }
        }

        return maxLength;
    }
}
