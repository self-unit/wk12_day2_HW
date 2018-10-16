public class Dodgems extends Attraction implements ITicketed {

    public Dodgems() {
        super("Dodgems");
    }

    public double defaultPrice(){
        return 4.50;
    }

    public double priceFor(Visitor visitor){
        if (visitor.getAge() <= 11) {
            return (defaultPrice() / 2);
        } else {
            return defaultPrice();
        }
    }
}
