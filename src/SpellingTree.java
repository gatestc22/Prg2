public class SpellingTree {

    SpellingNode root;

    public SpellingTree() {
        root = new SpellingNode(' ');
    }

    public boolean addWord(String word) {
        for (int i = 0; i < word.length(); i++) {
            root.addChild(word.charAt(i));
            // TODO: modify boolean var in SpNo on last char
        }
        return false; // STUD
    }

    public boolean checkWord(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (root.getChildAt(word.charAt(i)) == null) return false;
        }
        return true;
    }

    public void printWords(String subWord, SpellingNode c) {
        subWord = subWord + this.root.value;
        for (int i = 0; !checkWord(subWord); i++) {
            if (checkWord(subWord)) {
                System.out.println();
                c = c.getChildAt(subWord.charAt(i - 1));
            }
            System.out.println(c.getChildAt(subWord.charAt(i)));
        }
    }

}
