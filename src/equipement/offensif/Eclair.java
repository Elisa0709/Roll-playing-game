package equipement.offensif;

import personnage.Personnage;

import java.util.Objects;

public class Eclair extends EquipementOffensif {
    public Eclair() {
        super("Eclair", 2, "Magicien");
    }

    public String toString() {
        return "Sort : " + super.getWeaponName() + "/n" + "Force d'attaque du sort : " + super.getWeaponAttack();
    }

    @Override
    public void interact(Personnage player) {
        String playerType = player.getType();
        int playerForceDefault = player.getDefaultForceAttaque();
        int playerForce = player.getForceAttaque();
        int weaponForce = super.getWeaponAttack();
        int finalForce = playerForce + weaponForce;

        System.out.println("Vous avez trouvez l'objet "+super.getWeaponName()+" de force "+weaponForce+"\n\n");

        if (playerType.equals(super.getMatchWithClass())) {
            player.setForceAttaque(playerForceDefault);

            player.setForceAttaque(playerForce + weaponForce);
            //            System.out.println("Bravo, l'objet "+getWeaponName()+" augmente votre force de " + super.getWeaponAttack() +
//                    ". Voter force d'attaque total est maintenant de " +
//                    player.getForceAttaque());
            System.out.println(playerForce);
            System.out.println(finalForce);
        }
        else{
            System.out.println("Votre classe ne vous permet pas d'équiper cet objet.");
        }

    }
}
