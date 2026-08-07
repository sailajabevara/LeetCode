class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0,maxLength=0;
        HashSet<Character> set = new HashSet<>();
        while(right < s.length()){
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                maxLength=Math.max(maxLength,right-left);
            }
            else{
             set.remove(s.charAt(left)); 
                left++;
            }
        }
        return maxLength;
    }
}