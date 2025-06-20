import dungeon.engine.GameEngine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGameEngine {
    private int x;
    private int y;

    @Test
    void testGetSize() {
        GameEngine ge = new GameEngine(10,10);

        assertEquals(10, ge.getSize(10));

    }

    @Test
    void move() {
        this.x = -1;
        this.x = 11;
        this.y = -1;
        this.y = 11;


    }
}
