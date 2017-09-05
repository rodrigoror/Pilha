package br.org.rrlabs.StackExample;

import java.util.Stack;

class MyStack {
	Stack<Integer> num;
	Integer min;

	MyStack() {
		num = new Stack<Integer>();
	}

	public Integer getMin() {
		return min;
	}

	public Integer pop() {
		Integer t = num.pop();
		Integer ret = null;
		if (t < min) {
			ret = min;
			min = 2 * min - t;
		} else {
			ret = t;
		}

		return ret;
	}

	public void push(Integer x) {
		if (num.isEmpty()) {
			min = x;
			num.push(x);
		}else if (x < min) {
			num.push(2 * x - min);
			min = x;
		} else {
			num.push(x);
		}
	}
}