package org.mitre.web;

public class Matrix {

	public static void main(String[] args){
		int mat[ ][ ] = { {1, 0, 0, 1}, 
				{0, 0, 1, 0}, 
				{0, 0, 0, 0},}; 
		printMatrix(mat,3,4);
		modifyMatrix(mat,3,4);
		printMatrix(mat,3,4);
	}

	private static void modifyMatrix(int[][] mat, int r, int c) {
		int[] row = new int[r];
		int[] col = new int[c];
		int i,j;
		for( i = 0;i<r;i++){
			row[i]=0;
		}
		for( j = 0;j<r;j++){
			col[j]=0;
		}
		for( i=0 ;i<r;i++){
			for( j=0;j<c;j++){
				if(mat[i][j]==1){
					row[i]=1;
					col[j]=1;
				}
			}
		}
		for( i=0 ;i<r;i++){
			for( j=0;j<c;j++){
				if(row[i]==1 || col[j]==1){
					mat[i][j] = 1;
				}
			}
		}
	}

	private static void printMatrix(int[][] mat, int r, int c) {
		for(int i=0 ;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(mat[i][j]+"");
			}
			System.out.println("");
		}
		
		
	}
}
