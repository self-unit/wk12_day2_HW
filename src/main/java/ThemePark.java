import java.util.ArrayList;
import java.util.Collection;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> allReviewed;

    public ThemePark(ArrayList<Attraction> attractions, ArrayList<Stall> stalls) {
        this.attractions = attractions;
        this.stalls = stalls;
        this.allReviewed = new ArrayList<>();
    }


    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

    public ArrayList<IReviewed> getAllReviewed() {
        for (Attraction attraction : attractions) {
            if(attraction instanceof IReviewed) {
                allReviewed.add((IReviewed) attraction);
            }
        }
        for (Stall stall : stalls) {
            if(stall instanceof IReviewed) {
                allReviewed.add((IReviewed) stall);
            }
        }
        return allReviewed;
    }

    public String getAllReviewedString() {
        getAllReviewed();
        String reviews = "";
        for (IReviewed review : allReviewed) {
            reviews += String.format("%s: %s, ", review.getReviewName(), review.getRating());
        }
        return reviews;
    }
}
