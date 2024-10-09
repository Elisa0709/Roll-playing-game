package Ennemis;

import Personnage.Personnage;

public class Gobelin extends Ennemi{
    public Gobelin(){
        super("Gobelin", 6, 1);
    }

    @Override
    public void interact(Personnage personnage) {
        System.out.println("Je suis un Gobelin");
    }
}
