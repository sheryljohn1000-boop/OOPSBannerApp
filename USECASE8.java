import java.util.HashMap;

public class USECASE8 {

    // Creates the character pattern map
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
                "  *  ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *   "
        });

        charMap.put('P', new String[]{
                "****",
                "*  *",
                "*  *",
                "****" ,
                "*   ",
                "*   ",
                "*   "
        });

        charMap.put('S', new String[]{
                " ** ",
                "*   ",
                "*   ",
                " *  ",
                "   *",
                "   *",
                "**  "
        });

        return charMap;
    }

    // Displays the banner
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        int patternHeight = charMap.get('O').length;

        for (int i = 0; i < patternHeight; i++) {

            for (char ch : message.toCharArray()) {

                String[] pattern = charMap.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[i] + "  ");
                }
            }

            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();

        String message = "OOPS";

        displayBanner(message, charMap);
    }
}