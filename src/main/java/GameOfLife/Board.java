package GameOfLife;

import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by devtest on 26/02/15.
 */
public class Board {
    private final Set<Point> alive;

    public Board(Point... points) {
        alive = new HashSet<Point>(Arrays.asList(points));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        if (alive != null ? !alive.equals(board.alive) : board.alive != null) return false;
        return true;
    }
    @Override
    public int hashCode() {
        return alive != null ? alive.hashCode() : 0;
    }
}
