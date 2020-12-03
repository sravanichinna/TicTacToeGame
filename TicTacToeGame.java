package com.java.TicTacToeGame;

public class TicTacToeGame {
	
	public static char[] gameBoard() {
		char[] board =new char[10];
		for(int i=1;i<10;i++)
		{
			board[i]='-';
			
		
		}
		return board;
	}
	public static void main(String[] args)
	{
		char[] board=gameBoard();
		
	}

}
