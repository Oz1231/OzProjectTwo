public class Plot extends Property{

    public static enum TYPE {
        URBAN,
        AGRICULTURAL,
        INDUSTRIAL
    }

    TYPE type;

    public Plot(String address, double area, double price, TYPE type) {
        super(address, area, price);
        this.type = type;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    @Override
    public void taxIt() {
        if (type == TYPE.URBAN)
        {
            System.out.println("10%");
        }
       else if (type == TYPE.AGRICULTURAL)
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
