public class Rollercoaster extends Attraction implements ISecurity, ITicketed {

    public Rollercoaster(){
        super("Rollercoaster");
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getHeight() >= 1.45) {
            return true;
        } else {
            return false;
        }
    }

    public double defaultPrice() {
        return 8.40;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 2.00) {
            return (defaultPrice() * 2);
        } else {
            return defaultPrice();
        }
    }
}
