import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DictionaryCommandLineCall {
    public static void dictionaryAdvanced() throws IOException {
        Dictionary x = new Dictionary();
        x = DictionaryManagement.insertFromFile();
        DictionaryCommandineShow.showAllWords(x);
        DictionaryManagement.DictionaryLookup(x);
    }
}
