public class King extends Judge{
    private double areaOfRuledTerritory;

    public King(String name, int age, String region, double dmg, String title, double areaOfRuledTerritory) {
        super(name, age, region, dmg, title);
        this.areaOfRuledTerritory = areaOfRuledTerritory;
    }

    public double getAreaOfRuledTerritory() {
        return areaOfRuledTerritory;
    }

    public void setAreaOfRuledTerritory(double areaOfRuledTerritory) {
        this.areaOfRuledTerritory = areaOfRuledTerritory;
    }

    @Override
    public String getTitle() {
        return super.getTitle();
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
