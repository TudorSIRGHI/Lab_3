public class Fisher extends Worker {
    private int numberOfFishes;

    public Fisher(String name, int age, String region, boolean work, int numberOfFishes) {
        super(name, age, region, work);
        this.numberOfFishes = numberOfFishes;
    }

    public int getNumberOfFishes() {
        return numberOfFishes;
    }

    public void setNumberOfFishes(int numberOfFishes) {
        this.numberOfFishes = numberOfFishes;
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
