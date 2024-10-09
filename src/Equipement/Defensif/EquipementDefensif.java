package Equipement.Defensif;

public abstract class EquipementDefensif {
    private String itemName;
    private int defenseLevel;


    public EquipementDefensif(String itemName, int defenseLevel) {
        this.itemName = itemName;
        this.defenseLevel = defenseLevel;
    }
    public String getItemName() {
        return itemName;
    }
    public int getDefenseLevel() {
        return defenseLevel;
    }
    public void setDefenseLevel(int defenseLevel) {
        this.defenseLevel = defenseLevel;
    }
    public void setItemName(String name) {
        this.itemName = name;
    }
}
