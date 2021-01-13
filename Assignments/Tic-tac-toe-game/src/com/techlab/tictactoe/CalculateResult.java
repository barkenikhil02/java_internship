package com.techlab.tictactoe;

public class CalculateResult {
	public static Result winner = Result.goingOn;
	private int cellFullsize = 36, totalRow = 8, noOfCell = 9, start = 0;
	private String p1 = "Player 1", p2 = "Player 2";

	public Result check(String[] board, GameBoard b) {
		b.printBoard();
		for (int i = start; i < totalRow; i++) {
			String line = null;

			switch (i) {
			case 0:
				line = board[Index.p0.getAction()] + board[Index.p1.getAction()] 
						+ board[Index.p2.getAction()];
				break;
			case 1:
				line = board[Index.p3.getAction()] + board[Index.p4.getAction()] 
						+ board[Index.p5.getAction()];
				break;
			case 2:
				line = board[Index.p6.getAction()] + board[Index.p7.getAction()]
						+ board[Index.p8.getAction()];
				break;
			case 3:
				line = board[Index.p0.getAction()] + board[Index.p3.getAction()] 
						+ board[Index.p6.getAction()];
				break;
			case 4:
				line = board[Index.p1.getAction()] + board[Index.p4.getAction()] 
						+ board[Index.p7.getAction()];
				break;
			case 5:
				line = board[Index.p2.getAction()] + board[Index.p5.getAction()]
						+ board[Index.p8.getAction()];
				break;
			case 6:
				line = board[Index.p0.getAction()] + board[Index.p4.getAction()] 
						+ board[Index.p8.getAction()];
				break;
			case 7:
				line = board[Index.p2.getAction()] + board[Index.p4.getAction()] 
						+ board[Index.p6.getAction()];
				break;
			}

			if (line.equals("XXX") || line.equals("OOO")) {
				return Result.won;
			}
		}
		int sum = 0;
		for (int i = start; i < noOfCell; i++) {
			if (GameBoard.board[i] != null) {
				sum += i;
			}
		}
		if (sum == cellFullsize)
			return Result.draw;
		return Result.goingOn;

	}

	public String WinnerResult(Mark m) {
		if (m == Mark.X) {
			return p1;
		}
		return p2;
	}
}
