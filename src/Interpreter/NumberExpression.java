package Interpreter;

public class NumberExpression implements Expression{
	int number;
	@Override
	
	public int interpret() {
		return number;
	}
	public NumberExpression(int number) {
		this.number = number;
	}
	
}
