public class TEST {
    public static SpellingTree spellingTree = new SpellingTree();
    public static SpellingNode spellingNode = new SpellingNode('c');
    public static void main(String[] args) {
        // a = 97
        printSN();
        spellingNode.addChild('c');
        printSN();
        spellingNode.getChildAt('c');
        printSN();
        spellingNode.addChild('g');
        printSN();
    }

    public static void printSN() {
        System.out.print("[");
        for (int i = 0; i < spellingNode.children.length; i++) {
            System.out.print(" " + spellingNode.children[i] + " ");
        }
        System.out.println("]");
    }

}
