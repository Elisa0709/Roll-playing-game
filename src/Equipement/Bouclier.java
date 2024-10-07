package Equipement;

public class Bouclier {
    private String name;
    private int defenseLevel;

    public Bouclier() {
        this.name = "Bouclier";
        this.defenseLevel = 3;
    }
    public String toString() {
        return "Item : " + name + "\n" +
                "Niveau de défense : " + defenseLevel + "\n" +
                "_________________________________\n";
    }
}
