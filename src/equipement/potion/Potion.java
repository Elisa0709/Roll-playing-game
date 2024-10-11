package equipement.potion;
import Interfaces.Interactable;

public abstract class Potion implements Interactable {
    private String potionName;
    private int heal;

    public Potion(String name, int heal) {
        this.potionName = name;
        this.heal = heal;
    }

    private void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    public String getPotionName() {
        return potionName;
    }
    public int getHeal() {
        return heal;
    }
}




