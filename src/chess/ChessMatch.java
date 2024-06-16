package chess;

import boardgame.Board;
<<<<<<< HEAD
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;
=======
>>>>>>> a72ca05baa321260f04ab678b104d0ebc1a381a0

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
<<<<<<< HEAD
		initialSetup();
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
=======
	}

	public ChessPiece[][] getPieces() {

		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows();i++) {
>>>>>>> a72ca05baa321260f04ab678b104d0ebc1a381a0
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece)board.piece(i, j);
			}
		}
		return mat;
	}
<<<<<<< HEAD
	
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
		board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
	}
=======
>>>>>>> a72ca05baa321260f04ab678b104d0ebc1a381a0
}
