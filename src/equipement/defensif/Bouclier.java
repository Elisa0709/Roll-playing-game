package equipement.defensif;

public class Bouclier extends EquipementDefensif{


    public Bouclier() {
        super("Bouclier", 1);
    }
    public String toString() {
        return "Bouclier : " + super.getDefenseLevel() + " points de défense\n" +
                "_________________________________\n";
    }
}
