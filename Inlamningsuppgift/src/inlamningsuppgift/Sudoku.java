package inlamningsuppgift;

public class Sudoku {
	
	private int[][] lattice;
	private static final int SIZE = 9;
	
	/** Constructs an empty (9*9) sudoku board */
	public Sudoku(){
		lattice = new int[SIZE][SIZE];
	}
	
	/**
	 * Returns the square at the specified row and column. 
	 * @return the sought-after square
	 * @param row and column of sought-after square
	 */
	public int getSquare(int row, int col){		
		return lattice[row][col];
	}
	
	/**
	 * Sets value of the square at the specified row and column. 
	 * post: square at row row and column col is assigned the new value input
	 * @param desired value input, row and column of square
	 */
	public void setSquare(int input, int row, int col){
		if(input < 0 || input > 9){
			return;
		} 
		lattice[row][col] = input;
	} 
	
	/**
	 * Checks validity of the value at the specified row and column. 
	 * @return true if specified square has a valid value, false if it breaks any rules
	 * @param desired value input, row and column of square
	 */
	public boolean checkSurroundings(int input, int row, int col){
		for(int i = 0; i < 9; i++){
			if(lattice[i][col] == input && i != row){
				return false;
			} else if(lattice[row][i] == input && i != col ){
				return false;
			}
		}
		
		int x1 = 3 * (row/ 3);
		int y1 = 3 * (col / 3);
		int x2 = x1 + 2;
		int y2 = y1 + 2;

		for (int x = x1; x <= x2; x++){
			  for (int y = y1; y <= y2; y++){
				  if (x != row && y != col && lattice[x][y] == input){
					  return false;
				  }
			  } 
		}
		return true;
	}
	
	/**
	 * Solves the sudoku. 
	 * @return true if any solution was found, false if unsolvable
	 */
	public boolean solve(){
		for(int r = 0; r < 9; r++){
			for(int c = 0; c < 9; c++){
				if(getSquare(r, c) != 0 && !checkSurroundings(getSquare(r, c), r, c)){
					return false;
				}
			}
		}
		return solve(0, 0);
	}
	
	private boolean solve(int i, int j) {
		if(i > 8){
			return true;
		} else if (lattice[i][j] == 0) {
			for (int input = 1; input < 10; input++) {
				if (checkSurroundings(input, i, j)) {
					lattice[i][j] = input;
					if (j < 8) {
						if (solve(i, j+1)) {
							return true;
						}
					} else {
						if (solve(i+1, 0)) {
							return true;
						}
					}
				}
				
				
			}
			lattice[i][j] = 0;
			return false;
			
		} else {
			if (checkSurroundings(lattice[i][j], i, j)) {
				if(i == 8 && j == 8){
					return true;
				} else if (j < 8) {
					if (solve(i, j+1)) {
						return true;
					}
				} else {
					if (solve(i+1, 0)) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
