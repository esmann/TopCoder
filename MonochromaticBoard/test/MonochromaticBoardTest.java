import org.junit.Test;
import static org.junit.Assert.*;

public class MonochromaticBoardTest {
	
	@Test
	public void test0() {
		String[] board = new String[] {"WBWBW",
 "BBBBB",
 "WBWBW",
 "WBWBW"};
		assertEquals(3, new MonochromaticBoard().theMin(board));
	}
	
	@Test
	public void test1() {
		String[] board = new String[] {"BBBB",
 "BBBB",
 "BBBB"};
		assertEquals(3, new MonochromaticBoard().theMin(board));
	}
	
	@Test
	public void test2() {
		String[] board = new String[] {"BBBBB",
 "BBBBB",
 "BBBBB",
 "BBBBB",
 "BBBBB",
 "BBBBB",
 "BBBBB",
 "BBBBB"};
		assertEquals(5, new MonochromaticBoard().theMin(board));
	}
	
	@Test
	public void test3() {
		String[] board = new String[] {"WW",
 "WW"};
		assertEquals(0, new MonochromaticBoard().theMin(board));
	}
	
	@Test
	public void test4() {
		String[] board = new String[] {"BBBBBBBB",
 "BBBBBBBB",
 "BBBBBBBB",
 "WBWBBBWB",
 "BBBBBBBB"};
		assertEquals(9, new MonochromaticBoard().theMin(board));
	}
}
