public abstract class Property {

    private String address = "Na, na";
    private double area = 0;
    private double price = 0;

    public abstract void taxIt();

    public Property(String address, double area, double price) {
        setAddress(address);
        setArea(area);
        setPrice(price);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address != null && !address.isEmpty() && address.trim().split("\\s+").length >= 2) {
            this.address = address;
        }
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if (area >= 0) {
            this.area = area;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return "Property Details:\n" +
                "Address: " + address + "\n" +
                "Area: " + area + " sqm\n" +
                "Price: $" + price;
    }
}
