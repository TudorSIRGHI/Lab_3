public class Judge extends Knight{
    private String title;

    public Judge(String name, int age, String region, double dmg, String title) {
        super(name, age, region, dmg);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
