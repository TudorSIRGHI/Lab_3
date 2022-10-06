public class Archon extends GeoMag{
    private long godForce;

    public Archon(String name, int age, String region, double dmg, String typeOfMagic, long godForce) {
        super(name, age, region, dmg, typeOfMagic);
        this.godForce = godForce;
    }

    public long getGodForce() {
        return godForce;
    }

    public void setGodForce(long godForce) {
        this.godForce = godForce;
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
