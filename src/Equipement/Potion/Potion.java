package Equipement.Potion;
import Equipement.Interactable;

public abstract class Potion implements Interactable {
    private String potionName;
    private int heal;

    public Potion(String name, int heal) {
        this.potionName = name;
        this.heal = heal;
    }
    
    public String getPotionName() {
        return potionName;
    }
    public void setPostionName(String potionName) {
        this.potionName = potionName;
    }
    public int getHeal() {
        return heal;
    }
    public void setHeal(int heal) {
        this.heal = heal;
    }


}
