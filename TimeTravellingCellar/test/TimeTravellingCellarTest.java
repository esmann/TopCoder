import org.junit.Test;
import static org.junit.Assert.*;

public class TimeTravellingCellarTest {
	
	@Test
	public void test0() {
		int[] profit = new int[] {1,2,3};
		int[] decay = new int[] {3,1,2};
		assertEquals(2, new TimeTravellingCellar().determineProfit(profit, decay));
	}
	
	@Test
	public void test1() {
		int[] profit = new int[] {3,2};
		int[] decay = new int[] {1,2};
		assertEquals(1, new TimeTravellingCellar().determineProfit(profit, decay));
	}
	
	@Test
	public void test2() {
		int[] profit = new int[] {3,3,3};
		int[] decay = new int[] {1,1,1};
		assertEquals(2, new TimeTravellingCellar().determineProfit(profit, decay));
	}
	
	@Test
	public void test3() {
		int[] profit = new int[] {1000,500,250,125};
		int[] decay = new int[] {64,32,16,8};
		assertEquals(992, new TimeTravellingCellar().determineProfit(profit, decay));
	}
}
