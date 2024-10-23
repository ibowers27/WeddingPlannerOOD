package Week6.Homework1.Problem1_Bowers;

// concrete implementation
public class TraditionalWedding implements WeddingPackage {
    // reference ENUM values for venue, catering, decoration, and photography
    private Venue venue;
    private Catering catering;
    private Decorations decorations;
    private Photography photography;

    // implement the getters and setters declared in the interface
    @Override
    public Venue getVenue() {
        return venue;
    }

    @Override
    public Catering getCatering() {
        return catering;
    }

    @Override
    public Decorations getDecorations() {
        return decorations;
    }

    @Override
    public Photography getPhotography() {
        return photography;
    }

    @Override
    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    @Override
    public void setCatering(Catering catering) {
        this.catering = catering;
    }

    @Override
    public void setDecorations(Decorations decorations) {
        this.decorations = decorations;
    }

    @Override
    public void setPhotography(Photography photography) {
        this.photography = photography;
    }

    // change displayStatus to specify that it is a traditional wedding
    @Override
    public void displayStatus() {
        System.out.println("Planning Traditional Wedding: \nWedding Package Type: Traditional Wedding \nVenue: " + getVenue() +
                "\nCatering: " + getCatering() + "\nDecorations: " + getDecorations() + "\nPhotography: " + getPhotography());
    }
}
