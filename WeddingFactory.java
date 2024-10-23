package Week6.Homework1.Problem1_Bowers;

/** Wedding Package Factory
 *  We use the Factory Pattern so that we can create different versions of  a single product type.
 *  This class creates different wedding packages using the Factory Pattern.
 */
public class WeddingFactory {
    // create wedding packages based on specified type
    public WeddingPackage createPackage(String type) {
        if (type.equalsIgnoreCase("Luxury")) {
            return new LuxuryWedding();
        } else if (type.equalsIgnoreCase("Destination")) {
            return new DestinationWedding();
        } else if (type.equalsIgnoreCase("Traditional")) {
            return new TraditionalWedding();
        } else {
            System.out.println("Please choose between Luxury, Destination, or Traditional package.");
            return null; // return null if no matching type is found
        }
    }
}
