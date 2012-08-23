import org.junit.Test;
import static org.junit.Assert.*;

public class TheTournamentDivTwoTest {
	
	@Test
	public void test0() {
		int[] points = new int[] {10, 1, 1};
		assertEquals(6, new TheTournamentDivTwo().find(points));
	}
	
	@Test
	public void test1() {
		int[] points = new int[] {1, 1, 1};
		assertEquals(-1, new TheTournamentDivTwo().find(points));
	}
	
	@Test
	public void test2() {
		int[] points = new int[] {0, 0, 0, 0, 0, 0, 0};
		assertEquals(0, new TheTournamentDivTwo().find(points));
	}
	
	@Test
	public void test3() {
		int[] points = new int[] {13, 8, 7};
		assertEquals(14, new TheTournamentDivTwo().find(points));
	}
}
