package pl.edu.wat.wcy.jfa.expr;
/**
 * 
 * @author Damian Fr¹szczak
 *
 */
public abstract class BinaryExpression extends Expression {
	private Expression leftExpr;
	private Expression rightExpr;

	public BinaryExpression(Expression leftExpr, Expression rightExpr) {
		this.leftExpr = leftExpr;
		this.rightExpr = rightExpr;
	}

	public Expression getLeftExpr() {
		return leftExpr;
	}

	public Expression getRightExpr() {
		return rightExpr;
	}
}
