public class Playground extends Attraction implements ISecurity {

    public Playground(){
        super("Playground");
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() <=15) {
            return true;
        } else {
            return false;
        }
    }
}
