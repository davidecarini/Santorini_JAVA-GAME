package it.polimi.ingsw.Le_Bestie.Model.Cards;

import it.polimi.ingsw.Le_Bestie.Model.Board.Board;
import it.polimi.ingsw.Le_Bestie.Model.Board.Cell;
import it.polimi.ingsw.Le_Bestie.Model.Builder.Builder;
import it.polimi.ingsw.Le_Bestie.Model.Player.Player;

/**
 * Class Hephaestus
 * your Builder may build one additional block(not dome)
 * on top of your first block
 * @author VeronicaRovelli
 */

public class Hephaestus extends GodCard{


    public Hephaestus(String name) {
        super(name);
    }


    @Override
    public int build(Board b, Builder w, Cell c, boolean usePower) {
        if(!usePower||c.getLevel()>2)
           return super.build(b, w, c, usePower);
       else
       {
           if(super.build(b, w, c, usePower)==1)
               return super.build(b, w, c, usePower);
           else
               return 0;
       }
    }
}