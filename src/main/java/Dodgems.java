public class Dodgems extends Attraction implements ITicketed, IReviewed {

    private int rating;

    public Dodgems(String name) {
        super(name);
        this.rating = 8;
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
    public double defaultPrice(){
        return 4.50;
    }

    @Override
    public double priceFor(Visitor visitor){
        if (visitor.getAge() <= 11) {
            return (defaultPrice() / 2);
        } else {
            return defaultPrice();
        }
    }
}
