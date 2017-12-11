package inlamningsuppgift;

public class Sudoku {
	
	private int[][] lattice;
	private static final int SIZE = 9;
	
	public Sudoku(){
		lattice = new int[SIZE][SIZE];
	}
	
	public int getSquare(int p1, int p2){		
		return lattice[p1][p2];
	}
	
	public void setSquare(int input, int p1, int p2){
		if(input < 1 || input > 9){
			return;
		} 
		lattice[p1][p2] = input;
	}
	
	public boolean checkSurroundings(int input, int row, int col){
		for(int i = 0; i < 9; i++){
			if(lattice[i][col] == input || lattice[row][i] == input){
				return false;
			}
		}
		
		/*int x1 = 3 * (row/ 3);
		int y1 = 3 * (col / 3);
		int x2 = x1 + 2;
		int y2 = y1 + 2;

		for (int x = x1; x <= x2; x++){
			  for (int y = y1; y <= y2; y++){
				  if (lattice[x][y] == input){
				    	return false;
				    }
			   } 
		  }*/
		 

	if(row < 3 && col < 3){
			for(int r = 0; r < 3; r++){
				for(int c = 0; c < 3; c++){
					if(lattice[r][c] == input){
						return false;
					}
				}
			}
		} else if(row < 3 && col < 6){
			for(int r = 0; r < 3; r++){
				for(int c = 3; c < 6; c++){
					if(lattice[r][c] == input){
						return false;
					}
				}
			}
		} else if(row < 3 && col < 9){
			for(int r = 0; r < 3; r++){
				for(int c = 6; c < 9; c++){
					if(lattice[r][c] == input){
						return false;
					}
				}
			}
		} else if(row < 6 && col < 3){
			for(int r = 3; r < 6; r++){
				for(int c = 0; c < 3; c++){
					if(lattice[r][c] == input){
						return false;
					}
				}
			}
		} else if(row < 9 && col < 3){
			for(int r = 6; r < 9; r++){
				for(int c = 0; c < 3; c++){
					if(lattice[r][c] == input){
						return false;
					}
				}
			}
		} else if(row < 6 && col < 6){
			for(int r = 3; r < 6; r++){
				for(int c = 3; c < 6; c++){
					if(lattice[r][c] == input){
						return false;
					}
				}
			}
		} else if(row < 6 && col < 9){
			for(int r = 3; r < 6; r++){
				for(int c = 6; c < 9; c++){
					if(lattice[r][c] == input){
						return false;
					}
				}
			}
		} else if(row < 9 && col < 6){
			for(int r = 6; r < 9; r++){
				for(int c = 3; c < 6; c++){
					if(lattice[r][c] == input){
						return false;
					}
				}
			}
		} else if(row < 9 && col < 9){
			for(int r = 6; r < 9; r++){
				for(int c = 6; c < 9; c++){
					if(lattice[r][c] == input){
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public void solve(){
		solve(0, 0);
	}
	
	public boolean solve(int i, int j) {
		if (lattice[i][j] == 0) {
			for (int input = 1; input < 10; input++) {
				if (checkSurroundings(input, i, j)) {
					lattice[i][j] = input;
					if(i == 8 && j == 8){
						return true;
					} else if (j < 8) {
						if (solve(i, j+1)) {
							return true;
						}
					} else {
						if (solve(i++, 0)) {
							return true;
						}
					}
				}
			}
			lattice[i][j] = 0;
			return false;
		} else {
			if (checkSurroundings(lattice[i][j], i, j)) {
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
		return false;
	}
}