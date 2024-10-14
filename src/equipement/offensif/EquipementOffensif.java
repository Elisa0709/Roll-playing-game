package equipement.offensif;

import Interfaces.Interactable;
import personnage.Personnage;

public abstract class EquipementOffensif implements Interactable {

    private String weaponName;
    private int weaponAttack;
    private String matchWithClass;


   public EquipementOffensif(String weaponName, int weaponAttack, String matchWithClass) {
       this.weaponAttack = weaponAttack;
       this.weaponName = weaponName;
       this.matchWithClass = matchWithClass;

   }

    protected String getWeaponName() {
        return weaponName;
    }
    protected int getWeaponAttack() {
        return weaponAttack;
    }
    protected String getMatchWithClass() {
       return matchWithClass;
    }

    private void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }


    @Override
    public void interact(Personnage player) {
        wait(350);
        System.out.println(this);
        if (player.getType().equals(getMatchWithClass())) {
            player.setForceAttaque(player.getDefaultForceAttaque() + getWeaponAttack());
             System.out.println("Bravo, l'objet "+getWeaponName()+" augmente votre force de " + getWeaponAttack() +
                    ". Votre force d'attaque total est maintenant de " +
                    player.getForceAttaque());
            System.out.println("player force : "+player.getForceAttaque());
        }
        else{
            System.out.println("Votre classe ne vous permet pas d'équiper cet objet.");
        }
    }
}
