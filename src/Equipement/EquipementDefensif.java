package Equipement;

import java.util.Objects;

public abstract class EquipementDefensif {
    private String name;
    private int defenseLevel;


    public EquipementDefensif() {
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
}
