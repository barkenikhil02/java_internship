package com.techlab.tictactoe.test;

import java.util.Scanner;

import com.techlab.tictactoe.*;

public class TictactoeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minPosition = 1, maxPosition = 9, num, player = 0;

		Scanner sc = new Scanner(System.in);
		GameBoard boardobj = new GameBoard();
		CalculateResult ra = new CalculateResult();

		boardobj.printBoard();

		System.out.println("Player 1 will get X symbol");

		while (CalculateResult.winner == Result.goingOn) {

			System.out.println("Enter player " + ((player % 2) + 1));
			System.out.print("Player " + ((player % 2) + 1) + " enter cell no ");

			num = sc.nextInt();

			if (num >= minPosition && num <= maxPosition) {

				if (GameBoard.board[num - 1] == null) {

					GameBoard.board[num - 1] = String.valueOf(boardobj.getTurn());

					CalculateResult.winner = ra.check(GameBoard.board, boardobj);

					if (CalculateResult.winner == Result.won) {

						System.out.println(ra.WinnerResult(boardobj.getTurn()) + " is winner ");
						break;

					} else if (CalculateResult.winner == Result.draw) {

						System.out.print("===================");
						System.out.print(" Match has been draw  ");
						System.out.println("===================");
						break;

					}
					if (boardobj.getTurn() == Mark.X) {

						boardobj.setTurn(Mark.O);

					} else {

						boardobj.setTurn(Mark.X);

					}
					player++;
				} else {

					try {

						throw new CellAlreadyFilledError("\ncell has been already entered");

					} catch (CellAlreadyFilledError e) {

						System.err.println(e.getMessage());
					}
				}
			} else {

				try {

					throw new InvalidPosError("\nInvalid Position");

				} catch (InvalidPosError e) {

					System.err.println(e.getMessage());
				}
			}
		}
	}

	}

