package pl.edu.wat.wcy.jfa.tree;

import pl.edu.wat.wcy.jfa.expr.*;

/**
 * 
 * @author Damian Fr�szczak
 *
 */
public interface TreeVisitor {
	public void visitPlusExpr(PlusExpression e);

	public void visitMinusExpr(MinusExpression e);

	public void visitIntegerTerminal(IntegerTerminal e);

	public void visitMultiplyExpr(MultiplyExpression e);

	public void visitDivideExpr(DivideExpression e);

	public void visitModExpr(ModExpression e);

	public void visitNegativIntegerTerminal(NegativIntegerTerminal e);
}
