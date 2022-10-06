public class Herbalist extends  Worker{
    private boolean canCollectHerbs;

    public Herbalist(String name, int age, String region, boolean work, boolean canCollectHerbs) {
        super(name, age, region, work);
        this.canCollectHerbs = canCollectHerbs;
    }

    public boolean isCanCollectHerbs() {
        return canCollectHerbs;
    }

    public void setCanCollectHerbs(boolean canCollectHerbs) {
        this.canCollectHerbs = canCollectHerbs;
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
