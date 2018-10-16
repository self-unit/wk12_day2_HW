public class Playground extends Attraction implements ISecurity {

    private int rating;

    public Playground(String name){
        super(name);
        this.rating = 5;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() <=15) {
            return true;
        } else {
            return false;
        }
    }
}
