import java.util.HashMap;

class Trie {
    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        var current = root;

        for (var ch : word.toCharArray()) {
            if (current.children[ch - 'a'] == null) {
                current.children[ch - 'a'] = new TrieNode();
            }
            current = current.children[ch - 'a'];
        }
        current.endOfWord = true;
    }
    
    public boolean search(String word) {
        var current = root;

        for (var ch : word.toCharArray()) {
            if (current.children[ch - 'a'] == null) {
                return false;
            }
            current = current.children[ch - 'a'];
        }
        return current.endOfWord == true;
    }
    
    public boolean startsWith(String prefix) {
        var current = root;

        for (var ch : prefix.toCharArray()) {
            if (current.children[ch - 'a'] == null) {
                return false;
            }
            current = current.children[ch - 'a'];
        }
        return true;
    }

    class TrieNode {
        public TrieNode[] children = new TrieNode[26];
        public boolean endOfWord = false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
