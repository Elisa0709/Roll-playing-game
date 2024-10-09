package Equipement.Offensif;

import Personnage.Personnage;

public class FireBall extends EquipementOffensif {

    public FireBall() {
        super("Boule de feu", 7);
    }
    public String toString() {
        return "Sort : "+ super.getWeaponName()+"/n"+"Force d'attaque du sort : "+super.getWeaponAttack();
    }

    @Override
    public void interact(Personnage personnage) {
        System.out.println("Je suis une Boule de feu");

    }
}
