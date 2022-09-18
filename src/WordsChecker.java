import java.util.HashSet;
import java.util.Set;

public class WordsChecker {

    private String text;
    Set<String> set = new HashSet<>();

    public WordsChecker(String text) {
        this.text = text;

        for (String s : text.split("\\P{IsAlphabetic}+")) {
            set.add(s);
            s = s.toLowerCase();
            set.add(s);
        }
    }

    public boolean hasWord(String word) {
        return set.contains(word);
    }
}
