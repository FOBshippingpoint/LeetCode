class Solution {
    public boolean isPalindrome(String s) {
        var start = 0;
        var end = s.length() - 1;
        s = s.toLowerCase();
        while (start <= end) {
            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            } else if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            } else {
                if (s.charAt(start) != s.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
