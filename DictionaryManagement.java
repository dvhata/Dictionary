// Enter

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DictionaryManagement {
    /**
     * Insert Words from file.
     */
    public static Dictionary insertFromFile() throws FileNotFoundException {
        Dictionary x = new Dictionary();
        try {
            File f = new File("Dictionaries.txt");
            Scanner sc = new Scanner(f);
            int i = 0;
            while (sc.hasNextLine()) {
                sc.useDelimiter("\t");
                x.words[i] = new Word();
                x.words[i].setWord_target(sc.next());
                x.words[i].setWord_explain(sc.nextLine());
                i++;
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR!");
            e.printStackTrace();
        }
        return x;
    }

    /**
     * Tra cuu tu dien.
     */
    public static void DictionaryLookup(Dictionary x) {
        int numWords = x.words.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("****Tra cuu tu dien****");
        System.out.println("Nhap tu: ");
        String s = sc.nextLine();
        for (int i = 0; i < numWords; i++) {
            if (s == x.words[i].getWord_target()) {
                System.out.println(x.words[i].getWord_explain());
            } else {
                System.out.println("Error not found !");
            }
        }
    }
}

