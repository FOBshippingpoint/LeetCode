class Solution {
    public int longestPalindrome(String s) {
        var map = new int[81]; // int default value is 0 (guaranteed by lang spec)
        // ascii table from 'A' to 'z' = 41 to 122

        for (var c : s.toCharArray()) {
            map[c - 'A']++;
        }

        var sum = 0;
        var hasSingle = false;
        for (var count : map) {
            sum += count / 2;
            hasSingle = hasSingle || count % 2 == 1;
        }
        
        if (hasSingle) {
            // abbba
            return sum * 2 + 1;
        } else {
            // abba
            return sum * 2;
        }
    }
}
