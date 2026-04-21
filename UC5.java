import java.util.HashMap;
import java.util.Map;

class CharacterPattern {

    private Map<Character, String[]> patterns = new HashMap<>();

    public CharacterPattern() {

        patterns.put('O', new String[] {
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        });

        patterns.put('P', new String[] {
                "*****",
                "*   *",
                "*****",
                "*    ",
                "*    "
        });
    }

    public String[] getPattern(char ch) {
        return patterns.get(ch);
    }
}

public class UC5 {

    public static void main(String[] args) {

        CharacterPattern cp = new CharacterPattern();
        String word = "OOPS";

        for (int row = 0; row < 5; row++) {
            for (int i = 0; i < word.length(); i++) {
                String[] pattern = cp.getPattern(word.charAt(i));
                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                }
            }
            System.out.println();
        }
    }
}
