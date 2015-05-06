package checker.moveSystem;

import components.Square;
import components.pieces.Piece;

public class Move {
	private Square start, end;
	private Piece victim;

	public void setVictim(Piece victim){
		this.victim=victim;
	}
	
	public Move(Square start, Square end){
		if (start.equals(end))
			return;
		 this.start=start;
		 this.end=end;
			
	}
	
	
	/**
	 * @return the start square
	 */
	public Square getStart() {
		return start;
	}

	/**
	 * @return the end square
	 */
	public Square getEnd() {
		return end;
	}

}
