package it.polimi.ingsw.Le_Bestie.Model.Cards;

import it.polimi.ingsw.Le_Bestie.Model.Board.Cell;

public class Hephaestus extends GodCard{

    private boolean secondBuilt;
    private Cell startingCell;

    public Hephaestus(String name) {
        super(name);
    }
/*
    @Override
    public boolean move(Builder w, Cell c) {
        return false;
    }

    @Override
    public boolean build(Builder w, Cell c) {
        return false;
    }

    @Override
    public boolean HasWon() {
        return false;
    }
*/
    /*@Override
    public boolean HasLost() {
        return false;
    }*/
}