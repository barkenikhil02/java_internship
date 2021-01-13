package com.techlab.tictactoe;

public class GameBoard {
	public static String board[] = new String[9];
	private Mark turn = Mark.X;

	public Mark getTurn() {
		return turn;
	}
	public void setTurn(Mark turn) {
		this.turn = turn;
	}

	public void printBoard() {
		System.out.println("---------------------------");
		System.out.println("|   " + board[Index.p0.getAction()] + " | " + board[Index.p1.getAction()] + " | "
				+ board[Index.p2.getAction()] + "   |");
		System.out.println("---------------------------");

		System.out.println("|   " + board[Index.p3.getAction()] + " | " + board[Index.p4.getAction()] + " | "
				+ board[Index.p5.getAction()] + "   |");
		System.out.println("---------------------------");

		System.out.println("|   " + board[Index.p6.getAction()] + " | " + board[Index.p7.getAction()] + " | "
				+ board[Index.p8.getAction()] + "   |");
		System.out.println("---------------------------");
	}
}
