package pl.edu.wat.wcy.jfa.tree;

import java.util.Stack;

import pl.edu.wat.wcy.jfa.expr.*;
import pl.edu.wat.wcy.jfa.res.AbstractQueryResult;
import pl.edu.wat.wcy.jfa.res.IntegerResult;
/**
 * 
 * @author Damian Fr�szczak
 *
 */
public class Interpreter implements TreeVisitor {

	private Stack<AbstractQueryResult> qres = new Stack<AbstractQueryResult>();

	public int getCalcResult() {
		return ((IntegerResult) qres.pop()).getValue();
	}

	@Override
	public void visitPlusExpr(PlusExpression e) {
		e.getLeftExpr().accept(this);
		e.getRightExpr().accept(this);
		IntegerResult i2 = (IntegerResult) qres.pop();
		IntegerResult i1 = (IntegerResult) qres.pop();
		IntegerResult res = new IntegerResult(i1.getValue() + i2.getValue());
		qres.push(res);
	}

	@Override
	public void visitMinusExpr(MinusExpression e) {
		e.getLeftExpr().accept(this);
		e.getRightExpr().accept(this);
		IntegerResult i2 = (IntegerResult) qres.pop();
		IntegerResult i1 = (IntegerResult) qres.pop();
		IntegerResult res = new IntegerResult(i1.getValue() - i2.getValue());
		qres.push(res);
	}

	@Override
	public void visitIntegerTerminal(IntegerTerminal e) {
		qres.push(new IntegerResult(e.getValue()));
	}

	@Override
	public void visitMultiplyExpr(MultiplyExpression e) {
		e.getLeftExpr().accept(this);
		e.getRightExpr().accept(this);
		IntegerResult i2 = (IntegerResult) qres.pop();
		IntegerResult i1 = (IntegerResult) qres.pop();
		IntegerResult res = new IntegerResult(i1.getValue() * i2.getValue());
		qres.push(res);
	}

	@Override
	public void visitDivideExpr(DivideExpression e) {
		e.getLeftExpr().accept(this);
		e.getRightExpr().accept(this);
		IntegerResult i2 = (IntegerResult) qres.pop();
		IntegerResult i1 = (IntegerResult) qres.pop();
		IntegerResult res = new IntegerResult(i1.getValue() / i2.getValue());
		qres.push(res);
	}

	@Override
	public void visitModExpr(ModExpression e) {
		e.getLeftExpr().accept(this);
		e.getRightExpr().accept(this);
		IntegerResult i2 = (IntegerResult) qres.pop();
		IntegerResult i1 = (IntegerResult) qres.pop();
		IntegerResult res = new IntegerResult(i1.getValue() % i2.getValue());
		qres.push(res);
	}

	@Override
	public void visitNegativIntegerTerminal(NegativIntegerTerminal e) {
		qres.push(new IntegerResult(-e.getValue()));
	}

}
