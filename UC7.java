public class UC7 {

    /**
     * Inner Static Class to store character and its pattern
     */
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character and pattern
         * 
         * @param character the character
         * @param pattern   7-line banner pattern
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * 
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * 
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    // Utility method for 'O'
    public static CharacterPattern getOPattern() {
        return new CharacterPattern('O', new String[] {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });
    }

    // Utility method for 'P'
    public static CharacterPattern getPPattern() {
        return new CharacterPattern('P', new String[] {
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });
    }

    // Utility method for 'S'
    public static CharacterPattern getSPattern() {
        return new CharacterPattern('S', new String[] {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });
    }

    public static void main(String[] args) {

        // Array of CharacterPattern objects
        CharacterPattern[] patterns = {
                getOPattern(),
                getOPattern(),
                getPPattern(),
                getSPattern()
        };

        // Build and print banner using StringBuilder
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : patterns) {
                line.append(cp.getPattern()[i]).append("  ");
            }

            System.out.println(line.toString());
        }
    }
}
