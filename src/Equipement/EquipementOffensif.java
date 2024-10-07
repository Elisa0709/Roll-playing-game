package Equipement;

import java.util.Objects;

public class EquipementOffensif {

    private String itemType;
    private String name;
    private int attackLevel;

   public EquipementOffensif(String type) {
       if (Objects.equals(type, "Arme")){
           itemType = type;
           name = "Massue";
           attackLevel = 3;
       }
       else if (Objects.equals(type, "Sort")){
           itemType = type;
           name = "Eclair";
           attackLevel = 2;
       }
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

    public String toString(){
        return "Type d'équipement offensif : " + itemType +"\n"+
                "Item : "+name+"\n"+
                "Niveau d'attaque : "+attackLevel+"\n"+
                "*-------------------------------*\n";
    }
}
