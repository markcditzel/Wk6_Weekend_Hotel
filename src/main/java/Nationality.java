public enum Nationality { // OPEN ENUM

    /** Define the enum ITEM using capitals*/
    BRAZILIAN("Brazil"),
    UK ("United Kingdom"),
    POLISH ("Poland"),
    SOUTH_AFRICAN ("South Africa");

    // SIMILAR to definign instance variabales
    // Define the properties of the FIELD ("Poland") associated to each enum ITEM (POLAND)
    // NATIONALITY ITEM = UK
    // nationality FIELD = "United Kingdom"
    private String nationality;

    // Constructor
    // This tells the enum to expect a FIELD-value of type STRING to be passed)
    Nationality(String nationality) {
        this.nationality = nationality;
    }

    // METHODS

    // GETTERS METHODS

    /** This method gets the FIELD-value associated with its enum-ITEM */
    public String getNationality(){ //OPEN Method
        return nationality;
    } // Close Method

}// CLOSE ENUM
