public class Monk extends GeoMag {
    private double healsPeople;

    public Monk(String name, int age, String region, double dmg, String typeOfMagic, double healsPeople) {
        super(name, age, region, dmg, typeOfMagic);
        this.healsPeople = healsPeople;
    }

    public double getHealsPeople() {
        return healsPeople;
    }

    public void setHealsPeople(double healsPeople) {
        this.healsPeople = healsPeople;
    }

    @Override
    public String getTypeOfMagic() {
        return super.getTypeOfMagic();
    }

    @Override
    public double getDmg() {
        return super.getDmg();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getRegion() {
        return super.getRegion();
    }
}
