class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0, count = freqMap.size();
        int minLen = Integer.MAX_VALUE;
        int start = 0; // To store the start index of the smallest window
        while (right < s.length()) {
            char rightChar = s.charAt(right);
            if (freqMap.containsKey(rightChar)) {
                freqMap.put(rightChar, freqMap.get(rightChar) - 1);
                if (freqMap.get(rightChar) == 0) {
                    count--;
                }
            }
            right++; 
            while (count == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                char leftChar = s.charAt(left);
                if (freqMap.containsKey(leftChar)) {
                    freqMap.put(leftChar, freqMap.get(leftChar) + 1);
                    if (freqMap.get(leftChar) > 0) {
                        count++; 
                    }
                }

                left++; 
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}