package pl.edu.wat.wcy.jfa.expr;

import pl.edu.wat.wcy.jfa.tree.TreeVisitor;
/**
 * 
 * @author Damian Fr¹szczak
 *
 */
public class PlusExpression extends BinaryExpression {

	public PlusExpression(Expression leftExpr, Expression rightExpr) {
		super(leftExpr, rightExpr);
	}
	
	@Override
	public void accept(TreeVisitor t) {
		t.visitPlusExpr(this);	
	}
}
