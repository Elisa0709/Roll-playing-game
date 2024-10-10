import equipement.Interactable;
import personnage.Personnage;

public class CaseVide implements Interactable {

    @Override
    public void interact(Personnage personnage) {
        System.out.println("VIDE");
    }
}
