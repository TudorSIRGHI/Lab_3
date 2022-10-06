
public class Blacksmith extends  Worker{
    private double addHealthToTheArmor;

    public Blacksmith(String name, int age, String region, boolean work, double addHealthToTheArmor) {
        super(name, age, region, work);
        this.addHealthToTheArmor = addHealthToTheArmor;
    }

    public double getAddHealthToTheArmor() {
        return addHealthToTheArmor;
    }

    public void setAddHealthToTheArmor(double addHealthToTheArmor) {
        this.addHealthToTheArmor = addHealthToTheArmor;
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