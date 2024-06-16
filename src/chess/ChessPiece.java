package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {

	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
<<<<<<< HEAD
	
=======

>>>>>>> a72ca05baa321260f04ab678b104d0ebc1a381a0
	public Color getColor() {
		return color;
	}
}
