package Personnage;
import Equipement.Arme;

public class Guerrier extends Personnage {
private Arme arme;
private int weaponAttack;
private String weaponName;

    public Guerrier(String name) {
        super(name, "Guerrier");
        this.setPV(10);;
        this.setForceAttaque(10);
        this.arme = new Arme("Void");
        this.weaponAttack = arme.getWaponAttaque();
        this.weaponName = arme.getWeaponName();
    }

    public String toString() {
        return
                "                  [_]___[_]__[_]___[_]\n" +
                        "                  [__#__][__I_]__I__#]\n" +
                        "                  [_I_#_I__#[__]__#__]\n" +
                        "                     [_]_#_]__I_#_]\n" +
                        "                     [#__I____]__I]\n" +
                        "      .-.            [__I_#__I__[_]\n" +
                        "    __|=|__          [_#_[__#_]__#]\n" +
                        "   (_/`-`\\_)         [__#_I__[#_I_]\n" +
                        "   //\\___/\\\\         [_I__]__#_I__]\n" +
                        "   <>/   \\<>         [#__I__#_]__I]\n" +
                        "    \\|_._|/          [_I#__I___I_#]    .:.\n" +
                        "     <_I_>           [#__I__]_#___]   -=o=-\n" +
                        "      |||            [_I__I#__]___]    ':'\n" +
                        "cda  /_|_\\         \\\\[__]#___][__#]//, \\|/\n" +
                        "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^" +
                        "\n*-------------------------------------------*" + "\n" +
                        "                    " + this.getName() + "\n" +
                        "*-------------------------------------------*" + "\n" +

                        "Type :  Guerrier" + "\n" +
                        "PV : " + this.getPV()+
                        "Arme : "+this.weaponName+
                        "Attaque : " + (this.getForceAttaque()+this.weaponAttack) + "\n\n"
                ;
    }
}
