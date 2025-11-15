package mines;

import org.junit.jupiter.api.Test;
import javax.swing.JLabel;
import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    @Test
    public void testBoardInitialization() {
        JLabel status = new JLabel();
        Board board = new Board(status);

        assertNotNull(board.field, "Field array should not be null");
        assertEquals(board.rows * board.cols, board.field.length, "Field length should match rows*cols");
        assertNotNull(board.img, "Image array should not be null");
        assertEquals(Board.NUM_IMAGES, board.img.length, "Image array length should match NUM_IMAGES");
    }

    @Test
    public void testImagesLoaded() {
        JLabel status = new JLabel();
        Board board = new Board(status);

        for (int i = 0; i < Board.NUM_IMAGES; i++) {
            assertNotNull(board.img[i], "Image " + i + " should be loaded");
        }
    }

    @Test
    public void testNewGameResets() {
        JLabel status = new JLabel();
        Board board = new Board(status);

        board.newGame();
        assertTrue(board.inGame);
        assertEquals(board.mines, board.minesLeft);
    }
}
