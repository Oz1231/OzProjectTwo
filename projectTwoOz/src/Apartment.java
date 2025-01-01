public class Apartment extends Residential{

    int rooms =1;

    public Apartment(String address, double area, double price, int parkingLots, int rooms) {
        super(address, area, price, parkingLots);
        setRooms(rooms);
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        if(rooms>=1)
        this.rooms = rooms;
    }

    @Override
    public void taxIt() {
        System.out.println("8%");
    }

    @Override
    public String toString() {
        return super.toString() +" Apartment{" +
                "rooms=" + rooms +
                '}';
    }
}
