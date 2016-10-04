import static org.junit.Assert.*;

import org.junit.Test;

public class baseballTest {

	@Test
	public void testCompletedGame() {
		BaseballPlayer b = new BaseballPlayer("Bob", 12, "left", 1, 0,0);
		b.completedGame(0, 0);
		assertTrue("error in computing games played", b.getGames() ==2);
		BaseballPlayer c = new BaseballPlayer("Carl", 13, "Right", 1, 1, 0);
		c.completedGame(3, 0);
		assertTrue("Error in computing RBIs", c.getRbi() ==4);
		BaseballPlayer d = new BaseballPlayer("Dan", 14, "Right", 1, 0, 1);
		d.completedGame(0, 2);
		assertTrue("Error in computing runs", d.getRuns() == 3);
	}

}
