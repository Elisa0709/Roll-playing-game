package Equipement;

public class Arme extends EquipementOffensif{
    private int attaqueLevel;
    private String name;

    public Arme(String name) {
        this.name = name;
        switch (this.name) {
            case "Massue":
                this.attaqueLevel = 3;
                break;

            case "Epée":
                this.attaqueLevel = 5;
                break;
        }
    }
    public String toString() {
        return "Item : " + name + "\n" +
                "Niveau de défense : " + attaqueLevel + "\n" +
                "_________________________________\n";

    }
}
