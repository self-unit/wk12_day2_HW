public class Visitor {
    private int age;
    private double height;
    private double money;

    public Visitor(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public int getAge() {
        return age;
    }
}
