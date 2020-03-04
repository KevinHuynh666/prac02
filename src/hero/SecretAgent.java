package hero;

public class SecretAgent implements Hero {
    String trueName;
    String codeName;
    String gadget;
    boolean isSpy = false;
    public SecretAgent(String trueName, String codeName, String gadget)
    {
        this.trueName = trueName;
        this.codeName = codeName;
        this.gadget = gadget;
    }

    public String currentIdentity(){
        return (this.isSpy) ? codeName : trueName;
    }

    public void switchIdentity(){
        this.isSpy = !this.isSpy;
    }

    public String getGadget() {
        return this.gadget;
    }

}
