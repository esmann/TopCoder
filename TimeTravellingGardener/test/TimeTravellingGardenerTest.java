import org.junit.Test;
import static org.junit.Assert.*;

public class TimeTravellingGardenerTest {
	
	@Test
	public void test0() {
		int[] distance = new int[] {2,2};
		int[] height = new int[] {1,3,10};
		assertEquals(1, new TimeTravellingGardener().determineUsage(distance, height));
	}
	
	@Test
	public void test1() {
		int[] distance = new int[] {3,3};
		int[] height = new int[] {3,1,3};
		assertEquals(2, new TimeTravellingGardener().determineUsage(distance, height));
	}
	
	@Test
	public void test2() {
		int[] distance = new int[] {1,3};
		int[] height = new int[] {4,4,4};
		assertEquals(0, new TimeTravellingGardener().determineUsage(distance, height));
	}
	
	@Test
	public void test3() {
		int[] distance = new int[] {4,2};
		int[] height = new int[] {9,8,5};
		assertEquals(1, new TimeTravellingGardener().determineUsage(distance, height));
	}
	
	@Test
	public void test4() {
		int[] distance = new int[] {476,465,260,484};
		int[] height = new int[] {39,13,8,72,80};
		assertEquals(3, new TimeTravellingGardener().determineUsage(distance, height));
	}
	
	@Test
	public void test5() {
		int[] distance = new int[] {173,36,668,79,26,544};
		int[] height = new int[] {488,743,203,446,444,91,453};
		assertEquals(5, new TimeTravellingGardener().determineUsage(distance, height));
	}
	
	@Test
	public void test6() {
		int[] distance = new int[] {2,4,2,2,4,2,4,2,2,4};
		int[] height = new int[] {2,2,10,10,10,16,16,22,22,28,28};
		assertEquals(6, new TimeTravellingGardener().determineUsage(distance, height));
	}
}
