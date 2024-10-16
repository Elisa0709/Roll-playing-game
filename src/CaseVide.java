import Interfaces.Interactable;
import personnage.Personnage;

public class CaseVide implements Interactable {


    @Override
    public void interact(Personnage player) {
        System.out.println("La case est vide, vous profitez d'un petit peu de repos");
    }
}
