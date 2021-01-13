package com.techlab.tictactoe;

public class InvalidPosError extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidPosError(String s){
		super(s);
	}
}
