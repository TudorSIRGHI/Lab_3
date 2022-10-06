public class Miner extends Worker{
    private double numberOfMinerals;

    public Miner(String name, int age, String region, boolean work, double numberOfMinerals) {
        super(name, age, region, work);
        this.numberOfMinerals = numberOfMinerals;
    }

    public double getNumberOfMinerals() {
        return numberOfMinerals;
    }

    public void setNumberOfMinerals(double numberOfMinerals) {
        this.numberOfMinerals = numberOfMinerals;
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
