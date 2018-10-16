public class IceCreamStall extends Stall implements ITicketed {

    public IceCreamStall(String name, String ownerName, String parkingSpot) {
        super(name, ownerName, parkingSpot);
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
