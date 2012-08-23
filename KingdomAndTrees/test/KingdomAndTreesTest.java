import org.junit.Test;
import static org.junit.Assert.*;
/**
* Created with IntelliJ IDEA.
* User: Alex Esmann
* Date: 8/9/12
* Time: 10:24 PM
* To change this template use File | Settings | File Templates.
*/
public class KingdomAndTreesTest {
    @Test
    public void testMinLevel0() throws Exception {
        int[] heights = {9, 5, 11};
        assertEquals(3, new KingdomAndTrees().minLevel(heights));
    }
}
