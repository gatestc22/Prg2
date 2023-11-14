public class SpellingNode {

    char value;
    SpellingNode[] children;
    boolean correctWord;

    public SpellingNode(char value) {
        this.value = value;
        children = new SpellingNode[26];
        correctWord = false;
    }

    public void setCorrect() {
        if (this.getChildAt(this.value) == null) {
            correctWord = true;
        } else {
            correctWord = false;
        }
    }

    public boolean getCorrect() {
        return correctWord;
    }

    public boolean addChild(char val) {
        if (children[val - 97] != null) return false;
        children[val - 97] = new SpellingNode(val);
        return true;
    }

    public SpellingNode getChildAt(char val) {
        return children[val - 97];
    }

}
