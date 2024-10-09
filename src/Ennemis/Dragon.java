package Ennemis;

import Personnage.Personnage;

public class Dragon extends Ennemi  {
    public Dragon(){
        super("Dragon", 15, 4);
    }

    @Override
    public void interact(Personnage personnage) {
        System.out.println("Je suis un Dragon");
    }
}
