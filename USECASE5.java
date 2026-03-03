public class USECASE5 {

    public static void main(String[] args) {
        // Each line represents one row of the banner for O O P S
        String[] lines = {

            String.join(" ", "   ***  ", "   ***   ", " *****  ", " *****  "),
            String.join(" ", " *     *", " *     * ", " *   *  ", " *      "),
            String.join(" ", " *     *", " *     * ", " *   *  ", " *      "),
            String.join(" ", " *     *", " *     * ", " *****  ", " *****  "),
            String.join(" ", " *     *", " *     * ", " *      ", "     *  "),
            String.join(" ", " *     *", " *     * ", " *      ", "     *  "),
            String.join(" ", "   ***  ", "   ***   ", " *      ", " *****  ")
        };
        for (String line : lines) {
            System.out.println(line);
        }
    }
}