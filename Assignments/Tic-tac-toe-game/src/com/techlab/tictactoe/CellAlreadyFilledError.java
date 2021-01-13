package com.techlab.tictactoe;

public class CellAlreadyFilledError extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CellAlreadyFilledError(String s) {
		super(s);
	}

}
