public class Worker extends NPC{
    private boolean work;

    public Worker(String name, int age, String region, boolean work) {
        super(name, age, region);
        this.work = work;
    }


    public void setWork(boolean work) {
        this.work = work;
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
