package Equipement;

public class Sort extends EquipementOffensif {
    private int attaqueLevel;
    private String name;

    public Sort(String name) {
        this.name = name;
        switch (this.name) {
            case "Eclair":
                this.attaqueLevel = 2;
                break;

            case "Boule de feu":
                this.attaqueLevel = 7;
                break;
        }
    }
    public String toString() {
        return "Item : " + name + "\n" +
                "Niveau de défense : " + attaqueLevel + "\n" +
                "_________________________________\n";

    }

}
