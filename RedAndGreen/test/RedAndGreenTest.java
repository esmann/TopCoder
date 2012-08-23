import org.junit.Test;
import static org.junit.Assert.*;

public class RedAndGreenTest {
	
	@Test
	public void test0() {
		String row = "RGRGR";
		assertEquals(2, new RedAndGreen().minPaints(row));
	}
	
	@Test
	public void test1() {
		String row = "RRRGGGGG";
		assertEquals(0, new RedAndGreen().minPaints(row));
	}
	
	@Test
	public void test2() {
		String row = "GGGGRRR";
		assertEquals(3, new RedAndGreen().minPaints(row));
	}
	
	@Test
	public void test3() {
		String row = "RGRGRGRGRGRGRGRGR";
		assertEquals(8, new RedAndGreen().minPaints(row));
	}
	
	@Test
	public void test4() {
		String row = "RRRGGGRGGGRGGRRRGGRRRGR";
		assertEquals(9, new RedAndGreen().minPaints(row));
	}
}
