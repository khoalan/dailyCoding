package blind.trie;


class Trie {
    static int SIZE = 26;
    Trie[] childNode;
    boolean endOfWord;
    public Trie() {
        this.childNode = new Trie[SIZE];
        this.endOfWord = false;
    }

    public void insert(String word) {
        Trie[] child = this.childNode;
        for (int i=0; i<word.length(); i++){
            int idx = word.charAt(i)- 'a';
            if (child[idx] == null){
                child[idx] = new Trie();
            }
            if (i == word.length() - 1){
                child[idx].endOfWord = true;
            }
            child = child[idx].childNode;
        }
    }

    public boolean search(String word) {
        Trie[] child = this.childNode;
        for (int i=0; i<word.length(); i++){
            int idx = word.charAt(i)- 'a';
            if (child[idx] == null) return false;
            if (child[idx].endOfWord && i == word.length()-1) return true;
            child = child[idx].childNode;
        }
        return false;
    }

    public boolean startsWith(String prefix) {
        Trie[] child = this.childNode;
        for (int i=0; i<prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (child[idx] == null) return false;
            child = child[idx].childNode;
        }
        return true;
    }
}
public class TrieImpl {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("app");
        System.out.println(trie.search("apple"));
        System.out.println(trie.startsWith("apl"));
    }
}
