public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC5: Render OOPS as Banner using Inline Array Initialization
        
        // Combine array declaration, initialization, and population in a single statement
        String[] lines = {
            String.join("", "  *** ", "   ", "  *** ", "   ", " **** ", "   ", "  **** "),
            String.join("", " ** ** ", "   ", " ** ** ", "   ", " ** ** ", "   ", " ** "),
            String.join("", " ** ** ", "   ", " ** ** ", "   ", " ** ** ", "   ", " ** "),
            String.join("", " ** ** ", "   ", " ** ** ", "   ", " **** ", "   ", "  *** "),
            String.join("", " ** ** ", "   ", " ** ** ", "   ", " ** ", "   ", "     **"),
            String.join("", " ** ** ", "   ", " ** ** ", "   ", " ** ", "   ", "     **"),
            String.join("", "  *** ", "   ", "  *** ", "   ", " ** ", "   ", " **** ")
        };

        // Use a for-each loop to iterate through the array and print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}