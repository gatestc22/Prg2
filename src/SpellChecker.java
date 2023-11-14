import java.io.*;
import java.util.Scanner;

public class SpellChecker {

    static SpellingTree mytree;

    public static void main(String[] args) throws FileNotFoundException {
        String filename = "TestFile";
        Scanner sc = new Scanner(new File(filename));
        PrintWriter pw = new PrintWriter(new File("OutputFile"));
        mytree = new SpellingTree();

        while (sc.hasNext()) {
            pw.println(sc.nextLine());
        }

        sc.close();
        pw.close();

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