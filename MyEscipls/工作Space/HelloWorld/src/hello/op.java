package hello;

public class op {
	double num_one;
	double num_two;
	String op;
	double result;

	public double getNum_one() {
		return num_one;
	}

	public void setNum_one(double num_one) {
		this.num_one = num_one;
	}

	public double getNum_two() {
		return num_two;
	}

	public void setNum_two(double num_two) {
		this.num_two = num_two;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public double getResult() {
		return result;
	}

	public String execute() {
		if (op.equals("+")) {
			//result = Double.parseDouble(num_one) + Double.parseDouble(num_two);
			result = num_one + num_two;
			return "ok";
		} else if (op.equals("-")) {
			result = num_one - num_two;
			return "ok";
		} else if (op.equals("*")) {
			result = num_one * num_two;
			return "ok";
		} else if (op.equals("/") || (num_two==0)) {
			result = num_one / num_two;
			return "ok";
		} else {
			return "error";
		}

	}
}
