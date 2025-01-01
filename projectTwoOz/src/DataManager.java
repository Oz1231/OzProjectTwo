import java.util.ArrayList;

public class DataManager {

    public static ArrayList<Property> data() {

        ArrayList<Property> arr = new ArrayList<>();

        arr.add(new Plot("Tel Aviv, Namir 10", 500, 7000000, Plot.TYPE.URBAN));
        arr.add(new Plot("Ashkelon, Sderot Ben Gurion 3", 800, 12000000, Plot.TYPE.INDUSTRIAL));

        arr.add(new Apartment("Tel Aviv, Frishman 12", 120, 3000000, -1, 4));
        arr.add(new Apartment("Haifa, Herzl 4", 80, 1500000, 1, 3));

        arr.add(new Villa("Rishon Lezion, Hapalmach 5", 300, 5000000, 2, 2));
        arr.add(new Villa("Eilat, Derech Yotam 18", 350, 6000000, 3, 3));

        arr.add(new Vacation("Netanya, Hayarkon 20", 100, 2500000, 1, 6));
        arr.add(new Vacation("Ashdod, Ben Gurion 7", 90, 2000000, 0, 4));

        arr.add(new Commercial("Jerusalem, King George 10", 200, 8000000, 5.0));
        arr.add(new Commercial("Petah Tikva, Em Hamoshavot 15", 250, 9000000, true, 4.5));

        arr.add(new Office("Ramat Gan, Jabotinsky 5", 150, 4000000));
        arr.add(new Office("Eilat, Rager 12", 180, 3500000));


        return arr;
    }



}
