package equipement.defensif;

public class Philtre extends EquipementDefensif{

    public Philtre() {
        super("Philtre", 2);
    }
    public String toString() {
        return "Philtre : " + super.getDefenseLevel() + " points de défense\n" +
                "_________________________________\n";
    }
}
