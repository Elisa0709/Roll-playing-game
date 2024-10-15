package equipement.offensif;
import Interfaces.Interactable;
import personnage.Personnage;

/**
 * Classe abstraite représentant un équipement offensif dans le jeu. Chaque équipement a un nom,
 * une valeur d'attaque et une classe de personnage avec laquelle il peut être utilisé. Cette
 * classe implémente l'interface {@link Interactable}, ce qui permet à l'équipement d'interagir
 * avec les personnages du jeu.
 */

public abstract class EquipementOffensif implements Interactable {

    private String weaponName;
    private int weaponAttack;
    /**
     * Classe du personnage qui a le droit d'utiliser l'équipement
     */
    private String matchWithClass;

    /**
     * Constructeur de la classe EquipementOffensif. Initialise un équipement offensif avec un nom,
     * une valeur d'attaque et une classe de personnage compatible.
     *
     * @param weaponName     Le nom de l'équipement offensif.
     * @param weaponAttack   La valeur d'attaque de l'équipement.
     * @param matchWithClass La classe de personnage qui peut utiliser cet équipement.
     */
   public EquipementOffensif(String weaponName, int weaponAttack, String matchWithClass) {
       this.weaponAttack = weaponAttack;
       this.weaponName = weaponName;
       this.matchWithClass = matchWithClass;

   }

    public String getWeaponName() {
        return weaponName;
    }
    public int getWeaponAttack() {
        return weaponAttack;
    }
    public String getMatchWithClass() {
       return matchWithClass;
    }

    /**
     * Interagit avec un personnage. Si la classe du personnage est compatible avec
     * l'équipement, elle augmente la force d'attaque du personnage et affiche un message de succès.
     * Sinon, elle affiche un message d'erreur indiquant que la classe du personnage ne permet pas
     * d'équiper cet objet.
     *
     * @param player Le personnage avec lequel l'équipement interagit.
     */
//    @Override
//    public void interact(Personnage player, EquipementOffensif equipement) {
//
//        System.out.println(this);
//        if (player.getType().equals(getMatchWithClass())) {
//            player.equipementOffensif = new equipement("epee", 6, Guerier);
//
////            player.setForceAttaque(player.getDefaultForceAttaque() + getWeaponAttack());
//             System.out.println("Bravo, l'objet "+getWeaponName()+" augmente votre force de " + getWeaponAttack() +
//                    ". Votre force d'attaque total est maintenant de " +
//                    player.getForceAttaque());
//            System.out.println("player force : "+player.getForceAttaque());
//        }
//        else{
//            System.out.println("Votre classe ne vous permet pas d'équiper cet objet.");
//        }
//    }

//    public void displayLoot(Personnage player){
//        int playerArme = player.getEquipementOffensif();
//        System.out.println("Bravo, l'objet "+getWeaponName()+" augmente votre force de " + getWeaponAttack() +
//                ". Votre force d'attaque total est maintenant de " +
//                player.getForceAttaque());
//        System.out.println("player force : "+player.getForceAttaque() +);
//    }
//
//    public void displayIllealLoot(){
//        System.out.println("Votre classe ne vous permet pas d'équiper cet objet.");
//    }
}
