import ennemis.Dragon;
import ennemis.Ennemi;
import ennemis.Gobelin;
import ennemis.Sorcier;
import equipement.offensif.*;
import equipement.potion.BigPotion;
import equipement.potion.NormalPotion;
import equipement.potion.Potion;

public class Board {
    private Ennemi gobelin = new Gobelin();
    private Ennemi sorcier = new Sorcier();
    private Ennemi dragon = new Dragon();
    private EquipementOffensif fireBall = new FireBall();
    private EquipementOffensif eclair = new Eclair();
    private EquipementOffensif epee = new Epee();
    private EquipementOffensif massue = new Massue();
    private Potion normalPotion = new NormalPotion();
    private Potion bigPotion = new BigPotion();


    private int boardLength;
    public Board(){
        this.boardLength = 64;
    }

    public void chest1(){

    }




}
