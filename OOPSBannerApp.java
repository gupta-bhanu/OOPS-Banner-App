public class OOPSBannerApp {

    // Method to generate the pattern for the letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            "  *** ",
            " ** ** ",
            " ** ** ",
            " ** ** ",
            " ** ** ",
            " ** ** ",
            "  *** "
        };
    }

    // Method to generate the pattern for the letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            " **** ",
            " ** ** ",
            " ** ** ",
            " **** ",
            " ** ",
            " ** ",
            " ** "
        };
    }

    // Method to generate the pattern for the letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            "  **** ",
            " ** ",
            " ** ",
            "  *** ",
            "     **",
            "     **",
            " **** "
        };
    }

    public static void main(String[] args) {
        // UC6: Refactor Banner Logic into Functions
        
        // Declare String Arrays to hold patterns for each letter
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Use a loop to assemble and print each line of the banner
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + "   " + oPattern[i] + "   " + pPattern[i] + "   " + sPattern[i]);
        }
    }
}