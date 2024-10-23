package Week6.Homework1.Problem1_Bowers;

public enum Photography {
    // enum labels for photography options
    PRO("Professional"), LOCAL("Local");

    private final String label;

    // enum constructor
    Photography(String label) {
        this.label = label;
    }

    // return label as a string
    @Override
    public String toString() {
        return this.label;
    }
}
