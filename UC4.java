class CharacterPattern {

    public String[] getO() {
        return new String[] {
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        };
    }

    public String[] getP() {
        return new String[] {
                "*****",
                "*   *",
                "*****",
                "*    ",
                "*    "
        };
    }
}

public class UC4 {

    public static void main(String[] args) {

        CharacterPattern cp = new CharacterPattern();

        String[] O = cp.getO();
        String[] P = cp.getP();

        for (int i = 0; i < 5; i++) {
            System.out.println(O[i] + "  " + O[i] + "  " + P[i] + "  " + P[i]);
        }
    }
}
