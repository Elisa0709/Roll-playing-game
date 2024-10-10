package equipement.offensif;

import personnage.Personnage;

public class Massue extends EquipementOffensif {

    public Massue(){
        super("Massue", 3, "Guerrier");
    }

    public String toString() {
        return "Arme : "+ super.getWeaponName()+"/n"+"Force d'attaque de l'arme : "+super.getWeaponAttack();
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

            player.setForceAttaque(finalForce);
            //            System.out.println("Bravo, l'objet "+getWeaponName()+" augmente votre force de " + super.getWeaponAttack() +
//                    ". Voter force d'attaque total est maintenant de " +
//                    player.getForceAttaque());
            System.out.println(playerForce);

        }
        else{
            System.out.println("Votre classe ne vous permet pas d'équiper cet objet.");
        }

    }}
