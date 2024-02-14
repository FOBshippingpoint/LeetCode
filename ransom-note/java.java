class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] map = new int[26];

        for (var c : magazine.toCharArray()) {
            map[c - 'a']++;
        }
        for (var c : ransomNote.toCharArray()) {
            map[c - 'a']--;
            if (map[c - 'a'] == -1) {
                return false;
            }
        }
        return true;
    }
}
