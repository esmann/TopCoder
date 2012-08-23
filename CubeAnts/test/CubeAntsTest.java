import org.junit.Test;
import static org.junit.Assert.*;

public class CubeAntsTest {
	
	@Test
	public void test0() {
		int[] pos = new int[] {0,1,1};
		assertEquals(1, new CubeAnts().getMinimumSteps(pos));
	}
	
	@Test
	public void test1() {
		int[] pos = new int[] {5,4};
		assertEquals(2, new CubeAnts().getMinimumSteps(pos));
	}
	
	@Test
	public void test2() {
		int[] pos = new int[] {0};
		assertEquals(0, new CubeAnts().getMinimumSteps(pos));
	}
	
	@Test
	public void test3() {
		int[] pos = new int[] {6,1,6};
		assertEquals(3, new CubeAnts().getMinimumSteps(pos));
	}
	
	@Test
	public void test4() {
		int[] pos = new int[] {7,7,3,3,7,7,3,3};
		assertEquals(2, new CubeAnts().getMinimumSteps(pos));
	}
}
