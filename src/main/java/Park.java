public class Park extends Attraction implements IReviewed {

    private int rating;

    public Park(String name){
        super(name);
        this.rating = 9;
    }

    @Override
    public int getRating() {
        return 2;
    }

    @Override
    public String getReviewName(){
        return String.format("%s", getClass().getName());
    }
}
