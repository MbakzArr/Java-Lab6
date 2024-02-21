/**
 * StarWarsName.java
 * 
 * This program generates a Star Wars name based on provided input strings.
 * 
 * Sample runs:
 * Missing arg
 * 
 * Exception in thread "main" java.lang.IllegalArgumentException: missing data input 
 * at StarWarsName.main(StarWarsName.java:26)
 * 
 * Not four Strings:
 * 
 * ERROR: incorrect number of words provided.
 * 
 * Successful run:
 * 
 * Your Star Wars name is: Brami Shchi
 * 
 * @authors Khuliso Junior Ravhuravhu and Arehone Brenden Mbadaliga
**/

class StarWarsName {
    // Required number of strings
    private static final int STRING_NUM = 4;

    // Constants for array index
    private static final int FIRST_INDEX = 0;
    private static final int LASTNAME_INDEX = 1;
    private static final int MOM_NAME_INDEX = 2;
    private static final int CITY_OF_BIRTH_INDEX = 3;

    // Naming assignment
    private static final int LETTER_ONE = 0;
    private static final int LETTER_TWO = 2;
    private static final int LETTER_THREE = 3;

    public static void main(String[] args) {
        // Check if any arguments were provided
        if (args.length == FIRST_INDEX) {
            throw new IllegalArgumentException("Missing data input");
        }

        // Separate arguments with pipe
        String[] stNames  = args[FIRST_INDEX].split("\\|");
        int stNamesLength = stNames.length;

        // Check if correct number of arguments were provided
        if (stNamesLength != STRING_NUM) {
            System.out.println("ERROR: Incorrect Number Of Words Provided.");
            return;
        }

        // Extract names from arguments
        String firstName   = stNames[FIRST_INDEX];
        String lastName    = stNames[LASTNAME_INDEX];
        String momName     = stNames[MOM_NAME_INDEX];
        String cityOfBirth = stNames[CITY_OF_BIRTH_INDEX];

        // Generate Star Wars name
        String starWarsFirstName = firstName.substring(LETTER_ONE, LETTER_THREE) +
                                   lastName.substring(LETTER_ONE, LETTER_TWO).toLowerCase();
        String starWarsLastName  = momName.substring(LETTER_ONE, LETTER_TWO) +
                                   cityOfBirth.substring(LETTER_ONE, LETTER_THREE).toLowerCase();

        // Print Star Wars name
        System.out.format("Your Star Wars name is: %s %s%n", starWarsFirstName, starWarsLastName);
    }
}
