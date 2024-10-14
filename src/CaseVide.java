import Interfaces.Interactable;
import personnage.Personnage;

public class CaseVide implements Interactable {


    @Override
    public void interact(Personnage player) {
        System.out.println("Vous êtes sur une case vide");
    }
}
