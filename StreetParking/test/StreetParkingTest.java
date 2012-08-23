import org.junit.Test;
import static org.junit.Assert.*;

public class StreetParkingTest {
	
	@Test
	public void test0() {
		String street = "---B--S-D--S--";
		assertEquals(4, new StreetParking().freeParks(street));
	}
	
	@Test
	public void test1() {
		String street = "DDBDDBDDBDD";
		assertEquals(0, new StreetParking().freeParks(street));
	}
	
	@Test
	public void test2() {
		String street = "--S--S--S--S--";
		assertEquals(2, new StreetParking().freeParks(street));
	}
	
	@Test
	public void test3() {
		String street = "SSD-B---BD-DDSB-----S-S--------S-B----BSB-S--B-S-D";
		assertEquals(14, new StreetParking().freeParks(street));
	}
}
