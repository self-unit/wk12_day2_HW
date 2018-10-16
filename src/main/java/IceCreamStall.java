public class IceCreamStall extends Stall implements ITicketed, IReviewed {

    private int rating;

    public IceCreamStall(String name, String ownerName, String parkingSpot) {
        super(name, ownerName, parkingSpot);
        this.rating = 6;
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
    public double defaultPrice() {
        return 2.80;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getAge() > 5) {
            return defaultPrice() * 1.5;
        } else {
            return defaultPrice();
        }
    }
}
