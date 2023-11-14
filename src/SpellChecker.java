import java.io.*;
import java.util.Scanner;

public class SpellChecker {

    static SpellingTree mytree;

    public static void main(String[] args) throws FileNotFoundException {
        // TODO: check to see if this is how you do files
        String filename = "TestFile";
        Scanner sc = new Scanner(new File(filename));
        mytree = new SpellingTree();

        // TODO: readWords
        // TODO: printWords
        // TODO: checkWords and print
        // TODO: exit program
    }

    public static int checkWords(String filename) {
        // TODO
        return 0; // STUD
    }

    public static void readWords(String filename) {
        // TODO
    }

}