
public class Number {
	public Number(int bhlkumkum) throws MyNumberException {
		if (bhlkumkum < 0)
			throw new MyNumberException("Negative number");
		i = bhlkumkum;
	}
	public int i;
	public String changeBase (int base) throws MyNumberException {
		if (base < 2 && base > 16)
			throw new MyNumberException("Incorrect base");
		return Integer.toString(i, base);
	}
}