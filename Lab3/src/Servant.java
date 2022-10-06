public class Servant extends Judge {
    private int numberOfVillages;

    public Servant(String name, int age, String region, double dmg, String title, int numberOfVillages) {
        super(name, age, region, dmg, title);
        this.numberOfVillages = numberOfVillages;
    }

    public int getNumberOfVillages() {
        return numberOfVillages;
    }

    public void setNumberOfVillages(int numberOfVillages) {
        this.numberOfVillages = numberOfVillages;
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
