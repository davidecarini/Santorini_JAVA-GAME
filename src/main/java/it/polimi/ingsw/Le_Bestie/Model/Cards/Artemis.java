package it.polimi.ingsw.Le_Bestie.Model.Cards;


import it.polimi.ingsw.Le_Bestie.Model.Board.Cell;
import it.polimi.ingsw.Le_Bestie.Model.Builder.Builder;
import it.polimi.ingsw.Le_Bestie.Controller.MatchState;

import java.util.*;

public class Artemis extends GodCard{

    private boolean secondMove;
    private Cell startingCell;


    public Artemis(String name) {
        super(name);
        secondMove=false;
    }

    @Override
    public boolean move(Builder w, Cell c) {
       if(!MatchState.getHasMoved())
           if(super.move(w,c))
           {
               startingCell=c;
               return true;
           }


       if(MatchState.getHasMoved()&&!secondMove&&c!=startingCell)
          {
               super.move(w,c);
               secondMove=true;
               return true;
          }
       return false;
    }

    @Override
    public boolean build(Builder w, Cell c) {
              super.build(w,c);

        return false;
    }

    @Override
    public boolean HasWon() {
        return false;
    }

    @Override
    public boolean HasLost() {
        return false;
    }
}