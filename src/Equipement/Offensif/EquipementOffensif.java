package Equipement.Offensif;

import Equipement.Interactable;

public abstract class EquipementOffensif implements Interactable {

    private String weaponName;
    private int weaponAttack;


   public EquipementOffensif(String weaponName, int weaponAttack) {
       this.weaponAttack = weaponAttack;
       this.weaponName = weaponName;
   }

    protected String getWeaponName() {
        return weaponName;
    }
    protected void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
    protected int getWeaponAttack() {
        return weaponAttack;
    }
    protected void setWeaponAttack(int weaponAttack) {
        this.weaponAttack = weaponAttack;
    }



}
