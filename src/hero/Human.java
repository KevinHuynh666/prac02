package hero;

public class Human extends SuperHero {

    public Human (String realName, String secretIdentity)
    {
        super(realName,secretIdentity);
    }
    public int totalPower(){
        return 0;
    }

    public boolean hasPower(SuperPower queriedPower){
        return false;
    }
}
