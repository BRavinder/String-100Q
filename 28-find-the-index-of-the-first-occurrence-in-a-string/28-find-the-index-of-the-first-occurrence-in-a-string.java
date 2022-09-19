class Solution {
    public int strStr(String haystack, String needle) {
        
        if(needle.isEmpty())
        {
            return 0;
        }
        
        if(haystack.indexOf(needle) != -1)
        {
            return (haystack.indexOf(needle));
        }
        else
        {
            return -1;
        }
    }
}
// Time Complexity : O(1)
// Space Complexity :O(1)    