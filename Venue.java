package Week6.Homework1.Problem1_Bowers;

public enum Venue {
    // enum labels for venue types
    BEACH("Beach"), MOUNTAIN("Mountain");

    private final String label;

    // enum constructor
    Venue(String label) {
        this.label = label;
    }

    // return label as a string
    @Override
    public String toString() {
        return this.label;
    }
}
