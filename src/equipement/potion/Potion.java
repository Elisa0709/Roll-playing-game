package equipement.potion;
import Interfaces.Interactable;

/**
 * Classe abstraite représentant une potion. Les potions sont des objets interactifs
 * qui peuvent être utilisées pour soigner un personnage.
 */
public abstract class Potion implements Interactable {
    private final String potionName;
    private final int heal;

    /**
     * Constructeur de la classe Potion. Initialise une potion avec un nom et des points de guérison.
     *
     * @param name Le nom de la potion.
     * @param heal Le nombre de points de vie que la potion restaure.
     */
    public Potion(String name, int heal) {
        this.potionName = name;
        this.heal = heal;
    }

    public String getPotionName() {
        return potionName;
    }
    public int getHeal() {
        return heal;
    }
}




