package pl.edu.wat.wcy.jfa;

import pl.edu.wat.wcy.jfa.expr.Expression;
import pl.edu.wat.wcy.jfa.parser.CalculatorParser;
import pl.edu.wat.wcy.jfa.tree.Interpreter;

/**
 * 
 * @author Damian Fr�szczak
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		String input = "6%3";
		Integer result = calculate(input);
		System.out.println(result);

	}

	protected static Integer calculate(String input) throws Exception {
		CalculatorParser parser = new CalculatorParser(input);
		parser.user_init();
		parser.parse();
		Expression res = parser.RESULT;
		Interpreter i = new Interpreter();
		res.accept(i);
		return i.getCalcResult();
	}


}
