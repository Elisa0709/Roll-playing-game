package equipement.offensif;

import equipement.Interactable;

public abstract class EquipementOffensif implements Interactable {

    private String weaponName;
    private int weaponAttack;
    private String matchWithClass;


   public EquipementOffensif(String weaponName, int weaponAttack, String matchWithClass) {
       this.weaponAttack = weaponAttack;
       this.weaponName = weaponName;
       this.matchWithClass = matchWithClass;

   }

    protected String getWeaponName() {
        return weaponName;
    }
    protected int getWeaponAttack() {
        return weaponAttack;
    }
    protected String getMatchWithClass() {
       return matchWithClass;
    }


}
