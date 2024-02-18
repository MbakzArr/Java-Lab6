/**
 * @author Khuliso Junior Ravhuravhu and Arehone Brenden Mbadaliga
 **/

class StarWarsName {
    // Set number of arguments [strings required]
    private static final int stringsNum = 4;

    public static void main(String[] args) {
        // Separate arguments with pipe
        args = args[0].split("\\|");

        // Set arguments to Star Wars format
        String firstName = args[0];
        String lastName = args[1];
        String momName = args[2];
        String cityOfBirth = args[3];

        // Check if user included arguments
        if (args.length == 0) {
            throw new IllegalArgumentException("missing data input");
        } else if (args.length != stringsNum) {
            System.out.println("ERROR: incorrect number of words provided.");
        }

        String starWarsFirstName = firstName.substring(0, 3) + lastName.substring(0, 2).toLowerCase();
        String starWarsLastName = momName.substring(0, 2) + cityOfBirth.substring(0, 3).toLowerCase();

        System.out.format("Your Star Wars name is: %s %s%n", starWarsFirstName, starWarsLastName);
    }
}
