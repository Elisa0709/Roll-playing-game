package Equipement.Offensif;

import Personnage.Personnage;

public class Massue extends EquipementOffensif {

    public Massue(){
        super("Massue", 3);
    }

    public String toString() {
        return "Arme : "+ super.getWeaponName()+"/n"+"Force d'attaque de l'arme : "+super.getWeaponAttack();
    }

    @Override
    public void interact(Personnage personnage) {
        System.out.println("Je suis une Massue");
    }
}
