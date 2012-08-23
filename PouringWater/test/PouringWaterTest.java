import org.junit.Test;
import static org.junit.Assert.*;

public class PouringWaterTest {
	
	@Test
	public void test0() {
		int N = 3;
		int K = 1;
		assertEquals(1, new PouringWater().getMinBottles(N, K));
	}
	
	@Test
	public void test1() {
		int N = 13;
		int K = 2;
		assertEquals(3, new PouringWater().getMinBottles(N, K));
	}
	
	@Test
	public void test2() {
		int N = 1000000;
		int K = 5;
		assertEquals(15808, new PouringWater().getMinBottles(N, K));
	}
}
