package it.polimi.ingsw.Le_Bestie.Model;

import it.polimi.ingsw.Le_Bestie.Model.Board.Position;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.Assert.assertEquals;

public class PositionTest {

    @Test
    public void PositionTest(){
        Position p= new Position(1,1);
        assertNotNull(p);
        assertEquals(p.getX(), 1);
        assertEquals(p.getY(), 1);
        assertEquals(p.onGrid(), true);
        p.setX(5);
        p.setY(6);
        assertEquals(p.onGrid(), false);
        p.setY(3);
        assertEquals(p.onGrid(), false);
        p.setX(2);
        assertEquals(p.onGrid(), true);

        Position p1 = new Position(4,4);
        assertEquals(p1.toString(), "X  4,Y  4");
    }
}
