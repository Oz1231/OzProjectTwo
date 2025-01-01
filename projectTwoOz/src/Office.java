public class Office extends Property{

    @Override
    public void taxIt() {
        System.out.println("5%");

    }

    public Office(String address, double area, double price) {
        super(address, area, price);
    }

    @Override
    public String toString() {
        return super.toString() + " Office{}";
    }
}
