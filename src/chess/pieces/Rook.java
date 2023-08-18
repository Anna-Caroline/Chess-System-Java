package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color); // O construtor repassa a chamada para a super classe 
	}

	@Override
	public String toString() {
		return "R";
	}
}
