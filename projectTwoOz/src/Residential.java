public abstract class Residential extends Property {

    int parkingLots =0;


    public Residential(String address, double area, double price, int parkingLots)
    {

        super(address, area, price);
        setParkingLots(parkingLots);

    }

    public int getParkingLots() {
        return parkingLots;
    }

    public void setParkingLots(int parkingLots) {
        if(parkingLots>=0)
        this.parkingLots = parkingLots;
    }

    @Override
    public String toString() {
        return super.toString() + " Residential{" +
                "parkingLots=" + parkingLots +
                '}';
    }
}
