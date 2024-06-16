package application;

import chess.ChessPiece;

public class UI {
<<<<<<< HEAD
=======

>>>>>>> a72ca05baa321260f04ab678b104d0ebc1a381a0
	public static void printBoard(ChessPiece[][] pieces) {
		for (int i = 0; i < pieces.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j = 0; j < pieces.length; j++) {
				printPiece(pieces[i][j]);
			}
			System.out.println();
		}
<<<<<<< HEAD
		System.out.println("  a b c d e f g h");
=======
		System.out.print("  a b c d e f g h");
>>>>>>> a72ca05baa321260f04ab678b104d0ebc1a381a0
	}
	
	private static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.print("-");
		} else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}
}
