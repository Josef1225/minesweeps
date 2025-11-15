package mines;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MinesTest {

    @Test
    public void testMinesConstructor() {
        Mines mines = new Mines();
        assertNotNull(mines.statusbar, "Status bar should be initialized");
    }
}
