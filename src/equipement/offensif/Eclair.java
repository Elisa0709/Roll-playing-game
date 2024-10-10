package equipement.offensif;

import personnage.Personnage;

public class Eclair extends EquipementOffensif {
    public Eclair(){
        super("Eclair", 2);
    }
    public String toString() {
        return "Sort : "+ super.getWeaponName()+"/n"+"Force d'attaque du sort : "+super.getWeaponAttack();
    }

    @Override
    public void interact(Personnage personnage) {
        System.out.println("Je suis un Eclair");
    }
}
