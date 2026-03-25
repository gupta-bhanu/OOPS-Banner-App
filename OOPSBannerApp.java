public class OOPSBannerApp {

    /**
     * Inner class for storing character-to-pattern mappings.
     * Encapsulates a single character and its corresponding ASCII art pattern.
     */
    static class CharacterPatternMap {
        Character character;
        String[] pattern;

        // Constructor
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public Character getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Static Method to Create and initialize CharacterPatternMap array.
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] charMaps = new CharacterPatternMap[4];

        charMaps[0] = new CharacterPatternMap('O', new String[]{
            "  *** ", " ** ** ", " ** ** ", " ** ** ", " ** ** ", " ** ** ", "  *** "
        });
        charMaps[1] = new CharacterPatternMap('P', new String[]{
            " **** ", " ** ** ", " ** ** ", " **** ", " ** ", " ** ", " ** "
        });
        charMaps[2] = new CharacterPatternMap('S', new String[]{
            "  **** ", " ** ", " ** ", "  *** ", "     **", "     **", " **** "
        });
        charMaps[3] = new CharacterPatternMap(' ', new String[]{
            "   ", "   ", "   ", "   ", "   ", "   ", "   "
        });

        return charMaps;
    }

    /**
     * Retrieves the ASCII pattern for a given character.
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        // Fallback to space if character is not found
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ' ') {
                return map.getPattern();
            }
        }
        return new String[7];
    }

    /**
     * Prints a message as a banner using ASCII art patterns and StringBuilder.
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        for (int i = 0; i < 7; i++) {
            StringBuilder lineBuilder = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                lineBuilder.append(pattern[i]).append("   ");
            }
            System.out.println(lineBuilder.toString());
        }
    }

    public static void main(String[] args) {
        // UC7: Store Character Pattern in a Class
        
        // Create CharacterPatternMap array
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        // Define the message to be displayed
        String message = "OOPS";

        // Print the banner message
        printMessage(message, charMaps);
    }
}