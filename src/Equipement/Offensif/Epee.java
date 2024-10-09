package Equipement.Offensif;

import Personnage.Personnage;

public class Epee extends EquipementOffensif {
    public Epee(){
     super("Epée", 5);
    }

    public String toString() {
        return "Arme : "+ super.getWeaponName()+"/n"+"Force d'attaque de l'arme : "+super.getWeaponAttack();
    }

    @Override
    public void interact(Personnage personnage) {
        System.out.println("Je suis une Epée");
    }
}
