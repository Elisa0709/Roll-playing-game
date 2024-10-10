import equipement.Interactable;
import personnage.Personnage;

public class CaseVide implements Interactable {

    @Override
    public void interact(Personnage player) {
        System.out.println("VIDE");
    }
}
