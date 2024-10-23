package Week6.Homework1.Problem1_Bowers;

/** Wedding Package factory interface
 *  We use the Factory Pattern so that we can create different versions of  a single product type like
 *  wedding packages with options of luxury, destination, and traditional. This also allows for easy extensibility.
 */
public interface WeddingPackage {
    // getter and setters for wedding package options like value, catering, decorations, and photography
    Venue getVenue();
    Catering getCatering();
    Decorations getDecorations();
    Photography getPhotography();
    void setVenue(Venue venue);
    void setCatering(Catering catering);
    void setDecorations(Decorations decorations);
    void setPhotography(Photography photography);
    void displayStatus();
}
