package Week6.Homework1.Problem1_Bowers;

/** Builder Pattern: allows for customization of packages
 *  We use this pattern because we can produce different types and representations of
 *  an object (wedding packages) using the same builder code and methods.
 */
public class WeddingPackageBuilder {
    private WeddingPackage weddingPackage;

    // constructor for connecting the builder to the wedding package
    public WeddingPackageBuilder(WeddingPackage weddingPackage) {
        this.weddingPackage = weddingPackage;
    }

    // building methods
    public void buildVenue(Venue venue) {
        weddingPackage.setVenue(venue);
    }

    public void buildCatering(Catering catering) {
        weddingPackage.setCatering(catering);
    }

    public void buildDecorations(Decorations decorations) {
        weddingPackage.setDecorations(decorations);
    }

    public void buildPhotography(Photography photography) {
        weddingPackage.setPhotography(photography);
    }

    // get the wedding package that was just built
    public WeddingPackage getPackage() {
        return this.weddingPackage;
    }
}
