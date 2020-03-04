package hero;

import java.util.Arrays;
import java.util.HashSet;

public class SuperHuman extends SuperHero {
    SuperPower[] powerList;
    HashSet<SuperPower> pList;

    public SuperHuman(String realName, String secretIdentity, SuperPower[] innatePowers) {
        super(realName, secretIdentity);
        powerList = innatePowers;
        pList = new HashSet<>(Arrays.asList(powerList));

    }

    public boolean hasPower(SuperPower queriedPower) {
        return (this.pList.contains(queriedPower)) ? true : false;
    }

    @Override
    public int totalPower() {
        int total = 0;
        for (SuperPower i : this.pList
        ) {
            total += i.getValue();
        }
        return total;
    }

    public void acquirePowers(SuperPower[] newPowers) {
        for (SuperPower i : newPowers
        ) {
            if (!this.pList.contains(i)) {
                pList.add(i);
            }
        }
    }

    public void losePowers(SuperPower[] oldPowers) {
        for (SuperPower i : oldPowers
        ) {
            this.pList.remove(i);
        }
    }
}
