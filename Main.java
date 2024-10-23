package Week6.Homework1.Problem1_Bowers;

// test class for wedding planner program
public class Main {
    public static void main(String[] args) {
        // access the unique instance of the WeddingPlanner class
        WeddingPlanner planner1 = WeddingPlanner.getInstance();

        // create factory instance
        WeddingFactory factory = new WeddingFactory();

        // test the functions of a Luxury Wedding
        WeddingPackage luxuryWedding = factory.createPackage("Luxury");
        WeddingPackageBuilder luxuryBuilder = new WeddingPackageBuilder(luxuryWedding);
        luxuryBuilder.buildVenue(Venue.MOUNTAIN);
        luxuryBuilder.buildCatering(Catering.GOURMET);
        luxuryBuilder.buildDecorations(Decorations.ELEGANT);
        luxuryBuilder.buildPhotography(Photography.PRO);
        planner1.planWedding(luxuryWedding);
        luxuryWedding.displayStatus();

        System.out.println("---------");

        // get the Singleton instance from somewhere else in the program; this should get the same instance
        WeddingPlanner planner2 = WeddingPlanner.getInstance();

        // test the functions of a Traditional Wedding
        WeddingPackage traditionalWedding = factory.createPackage("Traditional");
        WeddingPackageBuilder traditionalBuilder = new WeddingPackageBuilder(traditionalWedding);
        traditionalBuilder.buildVenue(Venue.MOUNTAIN);
        traditionalBuilder.buildCatering(Catering.CLASSIC);
        traditionalBuilder.buildDecorations(Decorations.NO_DECOR);
        traditionalBuilder.buildPhotography(Photography.LOCAL);
        planner2.planWedding(traditionalWedding);
        traditionalWedding.displayStatus();

        System.out.println("---------");

        // get the instance again
        WeddingPlanner planner3 = WeddingPlanner.getInstance();

        // test the functions of a Destination Wedding
        WeddingPackage destinationWedding = factory.createPackage("destination");
        WeddingPackageBuilder destinationBuilder = new WeddingPackageBuilder(destinationWedding);
        destinationBuilder.buildVenue(Venue.BEACH);
        destinationBuilder.buildCatering(Catering.CLASSIC);
        destinationBuilder.buildDecorations(Decorations.NO_DECOR);
        destinationBuilder.buildPhotography(Photography.LOCAL);
        planner3.planWedding(destinationWedding);
        destinationWedding.displayStatus();

        System.out.println("---------");

        // get the instance again
        WeddingPlanner planner4 = WeddingPlanner.getInstance();

        // test a Destination Wedding with some different details
        WeddingPackage destinationWedding2 = factory.createPackage("destination");
        WeddingPackageBuilder destinationBuilder2 = new WeddingPackageBuilder(destinationWedding2);
        destinationBuilder2.buildVenue(Venue.BEACH);
        destinationBuilder2.buildCatering(Catering.GOURMET);
        destinationBuilder2.buildDecorations(Decorations.ELEGANT);
        destinationBuilder2.buildPhotography(Photography.PRO);
        planner4.planWedding(destinationWedding2);
        destinationWedding2.displayStatus();

        System.out.println("---------");

        // check if all the instances are the same
        System.out.println("Are all instances the same? " +  ((planner1 == planner2) && (planner2 == planner3) &&
                ((planner3 == planner4)) ? "yes" : "no"));
    }
}
