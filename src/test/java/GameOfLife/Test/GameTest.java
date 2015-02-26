package GameOfLife.Test;

import GameOfLife.Board;
import junit.framework.TestCase;
import org.junit.Test;

import static GameOfLife.Game.at;

public class GameTest extends TestCase {
    @Test
    public void testEqualValuePositions() throws Exception {
        assertEquals(at(0,1), at(0,1));
    }
    @Test
    public void testEqualBoard() throws Exception {
        assertEquals(new Board(at(0,1)), new Board(at(0,1)));
    }
}