package Equipement.Potion;

import Personnage.Personnage;

public class NormalPotion extends Potion {
    public NormalPotion() {
        super("Petite potion", 2);
    }

    @Override
    public void interact(Personnage personnage) {
        System.out.println("Je suis une petite potion");
    }
}
