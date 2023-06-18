package labTest2;

public class ChessSquare {
	private char file;
	private char rank;
	private String piece;
	
	public ChessSquare() {
		this.file = 'a';
		this.rank = '1';
		this.piece = "";
	}
	
	public ChessSquare(String file,String rank, String piece) {
		if (file.length() != 1 || rank.length() != 1 || piece.length() > 1) {
			throw new IllegalArgumentException();
		}
	}
	
}
