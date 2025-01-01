public class Commercial extends Property{

    boolean storeRoom = false;
    double yield = 0.0;


    public Commercial(String address, double area, double price, double yield) {
        super(address, area, price);
        setYield(yield);
    }

    public Commercial(String address, double area, double price, boolean storeRoom, double yield) {
        super(address, area, price);
        this.storeRoom = storeRoom;
        setYield(yield);
    }

    public boolean isStoreRoom() {
        return storeRoom;
    }

    public void setStoreRoom(boolean storeRoom) {
        this.storeRoom = storeRoom;
    }

    public double getYield() {
        return yield;
    }

    public void setYield(double yield) {
        if(yield>=0)
        this.yield = yield;
    }

    public double expectedYiels()
    {
       return getPrice()*(getYield()/100)/12;
    }

    @Override
    public void taxIt() {
        System.out.println("5%");

    }

    @Override
    public String toString() {
        return super.toString() + " Commercial{" +
                "storeRoom=" + storeRoom +
                ", yield=" + yield +
                '}';
    }
}
