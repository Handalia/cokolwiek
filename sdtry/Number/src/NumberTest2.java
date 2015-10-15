import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NumberTest2 {

	Number n;
	
	@Before
	public void Init() throws MyNumberException {
		n = new Number(0);
	}
	
	@After
	public void CleanUp() {
		n.i = 0;
	}
	
	@Test
	public void test() {
		
	}

}
