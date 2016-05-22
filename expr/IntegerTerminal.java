package pl.edu.wat.wcy.jfa.expr;

import pl.edu.wat.wcy.jfa.tree.TreeVisitor;
/**
 * 
 * @author Damian Fr¹szczak
 *
 */
public class IntegerTerminal extends Expression {
	private int value;

	public IntegerTerminal(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	@Override
	public void accept(TreeVisitor t) {
		t.visitIntegerTerminal(this);
	}
}
