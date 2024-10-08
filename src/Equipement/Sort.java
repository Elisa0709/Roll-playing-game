package Equipement;

public class Sort extends EquipementOffensif {
    private int spellAttack;
    private String spellName;

    public Sort(String name) {
        this.spellName = name;
        switch (this.spellName) {
            case "Eclair":
                this.spellAttack = 2;
                break;

            case "Boule de feu":
                this.spellAttack = 7;
                break;
            case "Void":
                this.spellAttack = 0;
        }
    }

    public int getSpellAttack() {
        return this.spellAttack;
    }
    public void setSpellAttack(int spellAttack) {
        this.spellAttack = spellAttack;
    }
    public String getSpellName() {
        return spellName;
    }
    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }
    public String toString() {
        return "Item : " + spellName + "\n" +
                "Niveau de défense : " + spellAttack + "\n" +
                "_________________________________\n";

    }

}
