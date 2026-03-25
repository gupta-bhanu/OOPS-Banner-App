import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    /**
     * Static Method to Create and initialize a HashMap for character patterns.
     */
    public static Map<Character, String[]> createCharacterPatternMap() {
        Map<Character, String[]> charMaps = new HashMap<>();

        charMaps.put('O', new String[]{
            "  *** ", " ** ** ", " ** ** ", " ** ** ", " ** ** ", " ** ** ", "  *** "
        });
        charMaps.put('P', new String[]{
            " **** ", " ** ** ", " ** ** ", " **** ", " ** ", " ** ", " ** "
        });
        charMaps.put('S', new String[]{
            "  **** ", " ** ", " ** ", "  *** ", "     **", "     **", " **** "
        });
        charMaps.put(' ', new String[]{
            "   ", "   ", "   ", "   ", "   ", "   ", "   "
        });

        return charMaps;
    }

    /**
     * Retrieves the ASCII pattern for a given character using the Map.
     */
    public static String[] getCharacterPattern(char ch, Map<Character, String[]> charMaps) {
        // If the character exists in the map, return it. Otherwise, return space.
        if (charMaps.containsKey(ch)) {
            return charMaps.get(ch);
        }
        return charMaps.get(' ');
    }

    /**
     * Prints a message as a banner using ASCII art patterns and StringBuilder.
     */
    public static void printMessage(String message, Map<Character, String[]> charMaps) {
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
        // UC8: Use Map for Character Patterns and Render via Function
        
        // Create the HashMap
        Map<Character, String[]> charMaps = createCharacterPatternMap();

        // Define the message to be displayed
        String message = "OOPS";

        // Print the banner message
        printMessage(message, charMaps);
    }
}