package Week6.Homework1.Problem1_Bowers;

public enum Decorations {
    // enum labels for decorations types
    ELEGANT("Elegant"), NO_DECOR("None");

    private final String label;

    // enum constructor
    Decorations(String label) {
        this.label = label;
    }

    // return label as string
    @Override
    public String toString() {
        return this.label;
    }
}
