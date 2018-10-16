public class Rollercoaster extends Attraction implements ISecurity, ITicketed, IReviewed {

    private int rating;

    public Rollercoaster(String name){
        super(name);
        this.rating = 4;
    }

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public String getReviewName(){
        return String.format("%s", getClass().getName());
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getHeight() >= 1.45) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 2.00) {
            return (defaultPrice() * 2);
        } else {
            return defaultPrice();
        }
    }
}
