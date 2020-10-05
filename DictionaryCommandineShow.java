// show
public class DictionaryCommandineShow {
    public static void showAllWords(Dictionary x) {
        System.out.println("No  " + "English    " + "Vietnamese     ");
        for (int i = 0; i < x.words.length; i++) {
            System.out.println((i + 1) + "  " + x.words[i].getWord_target() + "     "+x.words[i].getWord_explain());
        }
    }
}
