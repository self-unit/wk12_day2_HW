public class TobaccoStall extends Stall implements ISecurity, ITicketed {

    public TobaccoStall(String name, String ownerName, String parkingSpot) {
        super(name, ownerName, parkingSpot);
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
