package pl.edu.wat.wcy.jfa.expr;

import pl.edu.wat.wcy.jfa.tree.TreeVisitor;

public class MinusExpression extends BinaryExpression {

  public MinusExpression(Expression leftExpr, Expression rightExpr) {
    super(leftExpr, rightExpr);
  }

  @Override
  public void accept(TreeVisitor t) {
    t.visitMinusExpr(this);
  }
}
