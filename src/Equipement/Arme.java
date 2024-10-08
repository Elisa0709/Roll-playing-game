package Equipement;

public class Arme extends EquipementOffensif{
    private int weaponAttaque;
    private String weaponName;

    public Arme(String name) {
        this.weaponName = name;
        switch (this.weaponName) {
            case "Massue":
                this.weaponAttaque = 3;
                break;

            case "Epée":
                this.weaponAttaque = 5;
                break;
            case "Void":
                this.weaponAttaque = 0;
        }
    }

    public int getWaponAttaque() {
        return weaponAttaque;
    }
    public void setWeaponAttaque(int forceAttaque) {
        this.weaponAttaque = forceAttaque;
    }
    public String getWeaponName() {
        return weaponName;
    }
    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String toString() {
        return "Item : " + weaponName + "\n" +
                "Niveau de défense : " + weaponAttaque + "\n" +
                "_________________________________\n";

    }
}
