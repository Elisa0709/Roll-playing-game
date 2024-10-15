package personnage;


import equipement.offensif.Baton;
import equipement.offensif.EquipementOffensif;

public abstract class Personnage {
    private String name;
    private String type;
    private int defaultPV;
    private int pv;
    private int forceAttaque;
    private int defaultForceAttaque;
    private int nbPotion;
    private int nbGrandePotion;
    public EquipementOffensif equipementOffensif;


    protected Personnage() {
        this("Toto");
    }

    protected Personnage(String name) {
        this(name, "Personnage.Guerrier");
    }

    protected Personnage(String name, String type) {
        this.name = name;
        this.type = type;
        this.nbPotion = 0;
        this.nbGrandePotion = 0;
        this.equipementOffensif = new Baton();
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

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getForceAttaque() {
        return forceAttaque;
    }

    public void setForceAttaque(int forceAttaque) {
        this.forceAttaque = forceAttaque;
    }

    public int getDefaultForceAttaque() {
        return defaultForceAttaque;
    }

    public int getDefaultPV() {
        return defaultPV;
    }

    public void setDefaultForceAttaque(int defaultForceAttaque) {
        this.defaultForceAttaque = defaultForceAttaque;
    }

    public void setDefaultPV(int defaultPV) {
        this.defaultPV = defaultPV;
    }

    public void setEquipementOffensif(EquipementOffensif equipementOffensif) {
        this.equipementOffensif = equipementOffensif;
    }

    public EquipementOffensif getEquipementOffensif() {
        return this.equipementOffensif;
    }

    public int getNbGrandePotion() {
        return nbGrandePotion;
    }

    public int getNbPotion() {
        return nbPotion;
    }

    public void setNbGrandePotion(int nbGrandePotion) {
        this.nbGrandePotion = nbGrandePotion;
    }

    public void setNbPotion(int nbPotion) {
        this.nbPotion = nbPotion;
    }
}
