package equipement.potion;
import equipement.Interactable;
import personnage.Personnage;

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
    public void setPostionName(String potionName) {
        this.potionName = potionName;
    }
    public int getHeal() {
        return heal;
    }
    public void setHeal(int heal) {
        this.heal = heal;
    }

    @Override
        public void interact(Personnage player) {
                player.setPV(player.getPV() + this.heal);
                System.out.println(toString());
        }
    }


