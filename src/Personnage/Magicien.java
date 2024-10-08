package Personnage;

import Equipement.Sort;

public class Magicien extends Personnage {
    private Sort sort;
    private String spellName;
    private int spellAttack;

    public Magicien(String name) {
        super(name, "Magicien");
        this.setPV(6);
        this.setForceAttaque(15);
        this.sort = new Sort("void");
        this.spellAttack = sort.getSpellAttack();
        this.spellName = sort.getSpellName();
    }

    public String toString() {
        return "   \n" +
                "         /^\\     .        [_]___[_]__[_]___[_]\n" +
                "    /\\   \"V\"              [__#__][__I_]__I__#]\n" +
                "   /__\\   I      O  o     [_I_#_I__#[__]__#__]\n" +
                "  //..\\\\  I     .           [_]_#_]__I_#_]\n" +
                "  \\].`[/  I                 [#__I____]__I]\n" +
                "  \\|_._|/ (]                [__I_#__I__[_]\n" +
                " /. ~~ ,\\/I          .      [_#_[__#_]__#]\n" +
                " \\\\L__j^\\/I       o         [__#_I__[#_I_]\n" +
                "  \\/--v}  I     o   .       [_I__]__#_I__]\n" +
                "  |    |  I   _________     [#__I__#_]__I]\n" +
                "  |    |  I c(`       ')o   [_I#__I___I_#]    .:.\n" +
                "  |    l  I   \\.     ,/     [#__I__]_#___]   -=o=-\n" +
                " _/j  L l\\_!  _//^---^\\\\_   [_I__I#__]___]    ':'\n" +
                "cda                       \\\\[__]#___][__#]//, \\|/\n" +
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^" +
                "\n*-------------------------------------------*" + "\n" +
                "                    " + this.getName() + "\n" +
                "*-------------------------------------------*" + "\n" +

                "Type : Magicien"  + "\n" +
                "PV : " + this.getPV()+
                "Sort : "+this.spellName+
                "Attaque : " + (this.getForceAttaque()+this.spellAttack) + "\n\n"
                ;
    }
}
