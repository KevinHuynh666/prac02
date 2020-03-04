package hero;

public abstract class SuperHero implements Hero {
    String trueName;
    String publicName;
    boolean isHero ;
    public SuperHero(String trueIdentity, String alterEgo)
    {
        this.trueName = trueIdentity;
        this.publicName = alterEgo;
    }

    @Override
    public String currentIdentity() {
        return (this.isHero) ? this.publicName : this.trueName;
    }

    @Override
    public void switchIdentity() {
        this.isHero = !this.isHero;
    }
    public abstract boolean hasPower(SuperPower queriedPower);
    public abstract int totalPower();

}
