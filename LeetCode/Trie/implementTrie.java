// Implement a trie with insert, search, and startsWith methods.

// Note:
// You may assume that all inputs are consist of lowercase letters a-z.

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");

class TrieNode {

    HashMap<Character, TrieNode> map;
    char character;
    boolean last;
    
    // Initialize your data structure here.
    public TrieNode(char character) {
        
        this.map = new HashMap<Character, TrieNode>();
        this.character = character;
        this.last = false;
        
    }

}

public class ImplementTrie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode(' ');
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode current = root;
            
        for(char c : word.toCharArray()) {
            if(!current.map.containsKey(c)) {
                current.map.put(c, new TrieNode(c));
            }
            
            current = current.map.get(c);
        }
        
        current.last = true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode current = root;
        
        for(char c : word.toCharArray()) {
            if(!current.map.containsKey(c)) {
                return false;
            }
            
            current = current.map.get(c);
        }
        
        if(current.last == true) {
            return true;
        } else {
            return false;
        }
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode current = root;
        
        for(char c : prefix.toCharArray()) {
            if(!current.map.containsKey(c)) {
                return false;
            }
            
            current = current.map.get(c);
        }
        
        return true;
    }
}

