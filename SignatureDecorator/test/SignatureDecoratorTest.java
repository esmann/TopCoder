import org.junit.Test;
import static org.junit.Assert.*;

public class SignatureDecoratorTest {
	
	@Test
	public void test0() {
		String name = "Bob";
		String[] commands = new String[] {"surround", "append", "prepend"};
		String[] decorations = new String[] {"-=", "(", ")"};
		assertEquals(")-=Bob=-(", new SignatureDecorator().applyDecoration(name, commands, decorations));
	}
	
	@Test
	public void test1() {
		String name = "Super_Man_01";
		String[] commands = new String[] {};
		String[] decorations = new String[] {};
		assertEquals("Super_Man_01", new SignatureDecorator().applyDecoration(name, commands, decorations));
	}
	
	@Test
	public void test2() {
		String name = "4BcD3FgHIjklMN0pqrS7uVWxYZ_";
		String[] commands = new String[] {"append", "prepend", "surround"};
		String[] decorations = new String[] {"`{[(", ")]}'", ",.;<>?:|-=_+!@#$%^&*~"};
		assertEquals(",.;<>?:|-=_+!@#$%^&*~)]}'4BcD3FgHIjklMN0pqrS7uVWxYZ_`{[(~*&^%$#@!+_=-|:?><;.,", new SignatureDecorator().applyDecoration(name, commands, decorations));
	}
	
	@Test
	public void test3() {
		String name = "RacEcaR";
		String[] commands = new String[] {"surround"};
		String[] decorations = new String[] {"([{/"};
		assertEquals("([{/RacEcaR/{[(", new SignatureDecorator().applyDecoration(name, commands, decorations));
	}
}
