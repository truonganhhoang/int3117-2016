package com.uet.int3117;

import java.util.ArrayList;

public class MyStack {
	private ArrayList<Integer> stack = new ArrayList<>();

	public int push(Integer integer) {
		if (integer == null) {
			return -1;
		}
		stack.add(integer);
		return integer;
	}

	public int pop() {
		if (stack.isEmpty())
			return 0;
		stack.remove(0);
		return 1;
	}

	public Integer get(int index) {
		if (stack.isEmpty())
			return -1;
		return stack.get(index);
	}

}
