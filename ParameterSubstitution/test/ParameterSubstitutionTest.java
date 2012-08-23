import org.junit.Test;
import static org.junit.Assert.*;

public class ParameterSubstitutionTest {
	
	@Test
	public void test0() {
		String code = "if ($1 == $2) $3;";
		String[] params = new String[] {"12", "12", "doWhatIWant()"};
		assertEquals("if (12 == 12) doWhatIWant();", new ParameterSubstitution().processParams(code, params));
	}
	
	@Test
	public void test1() {
		String code = "$3+$1*$2-$7=$10";
		String[] params = new String[] {"myvar", "490jri", "e09jd9", "dlkjfoiej"};
		assertEquals("e09jd9+myvar*490jri-$7=myvar0", new ParameterSubstitution().processParams(code, params));
	}
	
	@Test
	public void test2() {
		String code = "12342123$13231232$2123211242$a$dlkj$";
		String[] params = new String[] {"$2", "$1"};
		assertEquals("12342123$23231232$1123211242$a$dlkj$", new ParameterSubstitution().processParams(code, params));
	}
	
	@Test
	public void test3() {
		String code = "{[(+.*-,/\\:;<=>?@)]}_`~|$$1";
		String[] params = new String[] {"1{[(+.*-,/\\:;<=>?@)]}_`~|"};
		assertEquals("{[(+.*-,/\\:;<=>?@)]}_`~|$1{[(+.*-,/\\:;<=>?@)]}_`~|", new ParameterSubstitution().processParams(code, params));
	}
	
	@Test
	public void test4() {
		String code = "$01";
		String[] params = new String[] {"abc"};
		assertEquals("$01", new ParameterSubstitution().processParams(code, params));
	}
}
