package Equipement;

public class Philtre {
    private String name;
    private int defenseLevel;

    public Philtre() {
        this.name = "Philtre";
        this.defenseLevel = 2;
    }
    public String toString() {
        return "Item : " + name + "\n" +
                "Niveau de défense : " + defenseLevel + "\n" +
                "_________________________________\n";
    }
}
