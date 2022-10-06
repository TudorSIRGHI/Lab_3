public class Knight extends NPC{
    private double dmg;

    public Knight(String name, int age, String region, double dmg) {
        super(name, age, region);
        this.dmg = dmg;
    }

    public double getDmg() {
        return dmg;
    }

    public void setDmg(double dmg) {
        this.dmg = dmg;
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
