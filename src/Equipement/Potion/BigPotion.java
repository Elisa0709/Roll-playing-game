package Equipement.Potion;

import Personnage.Personnage;

public class BigPotion extends Potion {
    public BigPotion() {
        super("Grande potion",5);
    }


    @Override
    public void interact(Personnage personnage) {
        System.out.println("Je suis une grande potion");
    }
}
