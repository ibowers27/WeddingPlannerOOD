package Week6.Homework1.Problem1_Bowers;

public enum Catering {
    // enum labels for catering options
    CLASSIC("Classic"), GOURMET("Gourmet");

    private final String label;

    // enum constructors
    Catering(String label) {
        this.label = label;
    }

    // return label to string
    @Override
    public String toString() {
        return this.label;
    }
}
