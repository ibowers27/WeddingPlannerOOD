package Week6.Homework1.Problem1_Bowers;

/** Singleton Pattern: ensures only one instance of WeddingPlanner exists and provides a global point
 *  of access to the instance (wedding package).
 */

public class WeddingPlanner {
    // ensure only one instance of WeddingPlanner exists
    private static WeddingPlanner instance = null;

    // prevent instantiation
    private WeddingPlanner() {}

    // method to get the Singleton instance
    public static WeddingPlanner getInstance() {
        if (instance == null) {
            synchronized (WeddingPlanner.class) {
                if (instance == null) {
                    instance = new WeddingPlanner();
                }
            }
        }
        return instance;
    }

    // method to "plan the wedding"
    public void planWedding(WeddingPackage weddingPackage) {
        System.out.println("Planning " + weddingPackage.getClass().getSimpleName() + "...");
    }
}
