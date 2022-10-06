public class GeoMag extends Knight{
    private String typeOfMagic;

    public GeoMag(String name, int age, String region, double dmg, String typeOfMagic) {
        super(name, age, region, dmg);
        this.typeOfMagic = typeOfMagic;
    }

    public String getTypeOfMagic() {
        return typeOfMagic;
    }

    public void setTypeOfMagic(String typeOfMagic) {
        this.typeOfMagic = typeOfMagic;
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
