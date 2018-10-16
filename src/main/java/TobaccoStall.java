public class TobaccoStall extends Stall implements ISecurity, ITicketed, IReviewed {

    public TobaccoStall(String name, String ownerName, String parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public int getRating() {
        return 1;
    }

    @Override
    public String getReviewName(){
        return String.format("%s", getClass().getName());
    }

    @Override
    public double defaultPrice() {
        return 6.60;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getAge() > 65) {
            return defaultPrice() * 1.5;
        } else {
            return defaultPrice();
        }
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
