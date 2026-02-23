public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC4: Refactoring to use Arrays and Loops for better modularity
        
        // Step 1: Store all the banner lines in a String Array
        // We use String.join inside the array for maximum efficiency
        String[] bannerLines = {
            String.join("", "  *** ", "   ", "  *** ", "   ", " **** ", "   ", "  **** "),
            String.join("", " ** ** ", "   ", " ** ** ", "   ", " ** ** ", "   ", " ** "),
            String.join("", " ** ** ", "   ", " ** ** ", "   ", " ** ** ", "   ", " ** "),
            String.join("", " ** ** ", "   ", " ** ** ", "   ", " **** ", "   ", "  *** "),
            String.join("", " ** ** ", "   ", " ** ** ", "   ", " ** ", "   ", "     ** "),
            String.join("", " ** ** ", "   ", " ** ** ", "   ", " ** ", "   ", "     ** "),
            String.join("", "  *** ", "   ", "  *** ", "   ", " ** ", "   ", " **** ")
        };

        // Step 2: Use an Enhanced For-Loop to iterate and print
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}