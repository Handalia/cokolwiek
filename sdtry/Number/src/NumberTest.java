import junit.framework.TestCase;

public class NumberTest extends TestCase {
	
	//sprawdza czy konstruktor tworzy obiekt
	public void testIsNull() throws MyNumberException{
		assertNotNull("Object not created", new Number(0));
	}
	
	//sprawdza czy konstruktor przekazuje argument do pola i
	public void testConstructor() throws MyNumberException {
		assertTrue("Broken Constructor", new Number(9872).i==9872);
	}
	
	//sprawdza czy zmienia system
	public void testIfChanging() throws MyNumberException {
		assertFalse("Not changed ;_;", new Number(3).changeBase(2)=="3");
	}
	
	//sprawdza czy prawidłowo zgłasza mój osobisty i fantastyczny wyjątek, który jest cool
	public void testNegative() {
		try{
			new Number(-5);
			fail();
		}
		catch(MyNumberException e){
			System.out.println(e.getMessage());
		}
	}
	//sprawdza czy poprawnie zmienia na dany system
	public void testCorrectChanging() throws MyNumberException {
		assertEquals("Incorrect Change", new Number(11).changeBase(3), "102");
	}
	
	
}
	