public class OOPSBannerApp {
    public static void main(String[] args) {
        // Use "" as delimiter. Each segment is padded to match the 9-char width requirement.
        System.out.println(String.join("", " ** ", " *** ", " **** ", " **** "));
        System.out.println(String.join("", "*  * ", "* * ", "*   * ", "*    "));
        System.out.println(String.join("", "*  * ", "* * ", "****  ", " *** "));
        System.out.println(String.join("", "*  * ", "* * ", "*     ", "    * "));
        System.out.println(String.join("", "*  * ", "* * ", "*     ", "    * "));
        System.out.println(String.join("", " ** ", " *** ", "*     ", " **** "));
        
        System.out.println("\nOOPS"); // Matches the footer in the PDF [cite: 372]
    }
}