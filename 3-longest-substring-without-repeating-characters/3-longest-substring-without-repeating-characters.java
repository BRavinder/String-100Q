class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        char[] str = s.toCharArray();
        int i = 0;
        int j = 0;
        int max = 0;
        
        Set set = new HashSet<>();
        while(j< str.length) {
            if(set.contains(str[j])) {
                while (set.contains(str[j])) {
                    set.remove(str[i]);
                    i++;
                }
            }
                set.add(str[j]);
                max = Math.max(max, j - i + 1);
                j++;
        }
            return max;
    }
}
// Time Complexity : O(n)