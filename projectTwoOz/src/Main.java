import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static class PriceException extends Exception {

        public PriceException(String message)
        {
         super(message);
        }

    }

   public static RealEstateManager oz = new RealEstateManager("oz");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Property> arr = DataManager.data();
        oz.setProperties(arr);

        while (true)
        {
            System.out.println("בחר פעולה:");
            System.out.println("1   >   חיפוש נכסים");
            System.out.println("2   >   דו״ח פיננסי");
            System.out.println("3   >   תשואת נדל״ן מסחרי");
            System.out.println("4   >   נכסים לפי עיר");
            System.out.println("5   >   כמות ערים");
            System.out.println("-1   >   יציאה מהתוכנית");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if(choice == -1)
                break;

            switch (choice) {
                case 1:
                    System.out.print("Enter price ");
                    double price = scanner.nextInt();

                    try {
                        propertiesList(price);
                    } catch (PriceException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    financialReport();
                break;
                case 3:
                    commercialYield();
                break;
                case 4:
                    System.out.print("Enter city name ");
                    String cname = scanner.nextLine();
                    cname = cname.toLowerCase().replace("-", "");
                    PropertiesByCity(cname);
                    break;
                case 5:
                    NumberOfCities();
                    break;
                default:
                    System.out.println("Invalid");
            }



        }


    }

   public static void propertiesList(double price) throws PriceException
   {
       if (price<0)
       {
           throw new PriceException("price cannot be negative");
       }

       for (Property p : oz.tillPrice(price))
       {
           System.out.println(p);
       }
   }

    public static void financialReport()
    {
        for (Property p : oz.getProperties())
        {
            System.out.println(p);
            System.out.println("tax payed:");
            p.taxIt();
        }
    }

    public static void commercialYield() {
        double sum = 0;

        for (Property p : oz.getProperties()) {
            if (p instanceof Commercial) {
                sum += ((Commercial) p).getYield();
            }
        }
        System.out.println("Total commercial yield: " + sum);
    }


    public static void PropertiesByCity(String cname) {


        for (Property p : oz.getProperties()) {

           String cAdrress = p.getAddress().toLowerCase();

            if (cAdrress.contains(cname)) {
                System.out.println(p);
            }
        }
    }

    public static void NumberOfCities()
    {

        HashMap < String, Boolean>  cities = new HashMap<>();

        for( Property p : oz.getProperties())
        {
          String name =  p.getAddress().split(",")[0];

          if(!cities.containsKey(name))
          {
              cities.put(name, true);
          }

        }
        int counter =0;

        for (String key : cities.keySet()) {
            System.out.println(key);
            counter++;
        }

        System.out.println(counter);

    }


}