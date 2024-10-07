package Personnage;

public class Magicien extends Personnage {

    //ajouter equipement offensif et defensif

    public Magicien(String name) {
        super(name, "Guerrier");
        this.setPV(6);
        this.setForceAttaque(15);
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
                "PV : " + this.getPV() + "   " +
                "Attaque : " + this.forceAttaque + "\n\n";
    }
}
