package ennemis;

import personnage.Personnage;

public class Sorcier extends Ennemi{
    public Sorcier(){
        super("Sorcier", 9, 2);
    }

    @Override
    public void interact(Personnage personnage) {
        System.out.println("Je suis un ennemi de type sorcier");
    }




}
