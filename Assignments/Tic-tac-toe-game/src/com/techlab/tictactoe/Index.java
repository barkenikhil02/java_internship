package com.techlab.tictactoe;

public enum Index {
	p0(0), p1(1), p2(2), p3(3), p4(4), p5(5), p6(6), p7(7), p8(8);

	private int action;

	public int getAction() {
		return this.action;
	}

	private Index(int action) {
		this.action = action;
	}
}