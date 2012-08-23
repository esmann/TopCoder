import org.junit.Test;
import static org.junit.Assert.*;

public class YahtzeeScoreTest {
	
	@Test
	public void test0() {
		int[] toss = new int[] { 2, 2, 3, 5, 4 };
		assertEquals(5, new YahtzeeScore().maxPoints(toss));
	}
	
	@Test
	public void test1() {
		int[] toss = new int[] { 6, 4, 1, 1, 3 };
		assertEquals(6, new YahtzeeScore().maxPoints(toss));
	}
	
	@Test
	public void test2() {
		int[] toss = new int[] { 5, 3, 5, 3, 3 };
		assertEquals(10, new YahtzeeScore().maxPoints(toss));
	}
}
