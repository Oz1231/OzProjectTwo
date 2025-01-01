import java.util.ArrayList;

public class RealEstateManager  {


    public String name;
    public ArrayList<Property> properties = new ArrayList<>();

    public RealEstateManager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }

    public void addToArray(Property p)
    {
        properties.add(p);
    }

    public ArrayList<Property> tillPrice(double price)
    {
        ArrayList<Property> propertiesNew = new ArrayList<>();

        for (Property p : properties)
        {
            if (p.getPrice()<=price)
            {
                propertiesNew.add(p);
            }
        }
        return propertiesNew;
    }

    public double sumPropertyPrice()
    {
     double sum =0;
        for (Property p : properties)
        {
            sum+= p.getPrice();
        }
        return sum;
    }

}
