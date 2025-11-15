package mines;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinesTest {

    @Test
    void testMinesConstructor() {
        Mines mines = new Mines();
        assertNotNull(mines.statusbar, "Status bar should be initialized");
    }
}
