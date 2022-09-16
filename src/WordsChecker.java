import java.util.HashSet;
import java.util.Set;

public class WordsChecker {

    private String text;

    public WordsChecker(String text) {
        this.text = text;
    }
    
    public boolean hasWord(String word) {
        String textLower = text.toLowerCase();
        Set<String> set = new HashSet<>();
        for (String s : textLower.split("\\P{IsAlphabetic}+")) {
            set.add(s);
        }
        return set.contains(word);
    }
}
