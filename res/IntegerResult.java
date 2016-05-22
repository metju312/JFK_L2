package pl.edu.wat.wcy.jfa.res;
/**
 * 
 * @author Damian Fr¹szczak
 *
 */
public class IntegerResult extends AbstractQueryResult {
	private int value;
	
	public IntegerResult(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	
}
