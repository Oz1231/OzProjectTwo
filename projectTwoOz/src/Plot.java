public class Plot extends Property{



    Type type;

    public Plot(String address, double area, double price, Type type) {
        super(address, area, price);
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void taxIt() {
        if (type == Type.URBAN)
        {
            System.out.println("10%");
        }
       else if (type == Type.AGRICULTURAL)
        {
            System.out.println("2%");
        }
      else
          System.out.println("5%");

    }

    @Override
    public String toString() {
        return super.toString()  + " Plot{" +
                "type=" + type +
                '}';
    }
}
