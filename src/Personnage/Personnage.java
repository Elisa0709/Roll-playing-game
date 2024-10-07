package Personnage;


import java.util.Objects;
import Equipement.EquipementOffensif;
import Equipement.EquipementDefensif;

public abstract class Personnage {


    private String name;
    private String type;
    private int PV;
    private int forceAttaque;
    private EquipementOffensif equipementOffensif;
    private EquipementDefensif equipementDefensif;




    public Personnage() {
        this("Toto");
    }
    public Personnage(String name) {
        this(name, "Personnage.Guerrier");
    }
    public Personnage(String name, String type) {
        this.name = name;
        this.type = type;
    }




    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getPV() {
        return PV;
    }
    public void setPV(int PV) {
        this.PV = PV;
    }
    public int getForceAttaque() {
        return forceAttaque;
    }
    public void setForceAttaque(int forceAttaque) {
        this.forceAttaque = forceAttaque;
    }

    public String toString() {
        if(Objects.equals(type, "Personnage.Guerrier")) {
            return "   \n" +
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
                    "                    " + this.name + "\n" +
                    "*-------------------------------------------*" + "\n" +

                    "Type : " + this.type + "\n" +
                    "PV : " + this.PV + "   " +
                    "Attaque : " + this.forceAttaque + "\n\n" +
                    equipementOffensif.toString() + "\n" +
                    equipementDefensif.toString() + "\n";
        }
        else{
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
                    "                    " + this.name + "\n" +
                    "*-------------------------------------------*" + "\n" +

                    "Type : " + this.type + "\n" +
                    "PV : " + this.PV + "   " +
                    "Attaque : " + this.forceAttaque + "\n\n" +
                    equipementOffensif.toString() + "\n" +
                    equipementDefensif.toString() + "\n";
        }
    } //en mettre un par défaut


}
