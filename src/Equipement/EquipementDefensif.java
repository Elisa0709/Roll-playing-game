package Equipement;

import java.util.Objects;

public class EquipementDefensif {
    private String name;
    private int defenseLevel;
    private String typeItem;


    public EquipementDefensif(String type) {
        if (Objects.equals(type, "Bouclier")) {
            name = "Bouclier";
            defenseLevel = 3;
            typeItem = type;

        } else if (Objects.equals(type, "Philtre")) {
            name = "Philtre";
            defenseLevel = 2;
            typeItem = type;

        }
    }


    public String getName() {
        return name;
    }

    public int getDefenseLevel() {
        return defenseLevel;
    }

    public void setDefenseLevel(int defenseLevel) {
        this.defenseLevel = defenseLevel;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return "Type d'équipement défensif :" + typeItem + "\n" +
                "Item : " + name + "\n" +
                "Niveau de défense : " + defenseLevel + "\n" +
                "_________________________________\n";

    }

}
