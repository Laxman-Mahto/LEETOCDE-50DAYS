package day26;

public class d211 {
    static class WordDictionary {
        private WordNode root;

        static class WordNode {
            WordNode[] children = new WordNode[26];
            boolean isEnd;
        }

        public WordDictionary() {
            root = new WordNode();
        }

        public void addWord(String word) {
            WordNode node = root;
            for (char c : word.toCharArray()) {
                if (node.children[c - 'a'] == null) {
                    node.children[c - 'a'] = new WordNode();
                }
                node = node.children[c - 'a'];
            }
            node.isEnd = true;
        }

        public boolean search(String word) {
            return searchInNode(word, 0, root);
        }

        private boolean searchInNode(String word, int index, WordNode node) {
            if (node == null) {
                return false;
            }
            if (index == word.length()) {
                return node.isEnd;
            }
            char c = word.charAt(index);
            if (c == '.') {
                for (WordNode child : node.children) {
                    if (child != null && searchInNode(word, index + 1, child)) {
                        return true;
                    }
                }
                return false;
            } else {
                return searchInNode(word, index + 1, node.children[c - 'a']);
            }
        }
    }
}
