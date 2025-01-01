public class Villa extends Residential {

    int levels=1;

    public Villa(String address, double area, double price, int parkingLots, int levels) {
        super(address, area, price, parkingLots);
        setLevels(levels);
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        if(levels>=1)
        this.levels = levels;
    }


    @Override
    public void taxIt() {
        System.out.println("8%");
    }

    @Override
    public String toString() {
        return super.toString() + " Villa{" +
                "levels=" + levels +
                '}';
    }
}
