package Equipement;

import java.util.Objects;

public abstract class EquipementOffensif {

    private String itemType;
    private String name;
    private int attackLevel;

   public EquipementOffensif() {

   }

    public String getItemType() {
        return itemType;
    }
    public void setItemType(String itemType) {
       this.itemType = itemType;
    }
    public String getName() {
       return name;
    }
    public void setName(String name) {
       this.name = name;
    }
    public int getAttackLevel() {
        return attackLevel;
    }
    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }


}
