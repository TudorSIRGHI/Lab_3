public class Chef extends Worker{
    private boolean canCook;

    public Chef(String name, int age, String region, boolean work, boolean canCook) {
        super(name, age, region, work);
        this.canCook = canCook;
    }

    public boolean isCanCook() {
        return canCook;
    }

    public void setCanCook(boolean canCook) {
        this.canCook = canCook;
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
