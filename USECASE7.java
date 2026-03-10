public class USECASE7 {

    static class CharacterPatternMap {
        char character;
        String[] pattern;

        CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap O = new CharacterPatternMap('O', new String[]{
                "  *  ",
                "*   *",
                "*   *",
                "*   *",
                "  *  "
        });

        CharacterPatternMap P = new CharacterPatternMap('P', new String[]{
                "**** ",
                "*  * ",
                "**** ",
                "*    ",
                "*    "
        });

        CharacterPatternMap S = new CharacterPatternMap('S', new String[]{
                " **  ",
                "*    ",
                " *   ",
                "   * ",
                " **  "
        });

        return new CharacterPatternMap[]{O, P, S};
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] maps) {

        for (CharacterPatternMap map : maps) {
            if (map.character == ch) {
                return map.pattern;
            }
        }
        return null;
    }

    public static void printMessage(String message, CharacterPatternMap[] maps) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            for (char ch : message.toCharArray()) {

                String[] pattern = getCharacterPattern(ch, maps);

                if (pattern != null) {
                    System.out.print(pattern[i] + "  ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}