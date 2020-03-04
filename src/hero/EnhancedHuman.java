package hero;

import java.util.Arrays;
import java.util.HashSet;

public class EnhancedHuman extends SuperHero {
    SuperPower[] powerList;
    HashSet<SuperPower> pList ;

    public EnhancedHuman(String normalIdentity, String enhancedIdentity, SuperPower[] acquiredPowers) {
        super(normalIdentity, enhancedIdentity);
        this.powerList = acquiredPowers;
        this.pList = new HashSet<>(Arrays.asList(powerList));

    }

    @Override
    public boolean hasPower(SuperPower queriedPower) {
        if (this.isHero) {
            return (this.pList.contains(queriedPower)) ? true : false;
        } else {
            return false;
        }
    }

    @Override
    public int totalPower() {
        int total = 0;
        if (this.isHero) {
            for (SuperPower i : this.pList
            ) {
                total += i.getValue();
            }

        }
        return total;
    }
}
