// Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column is set to 0.

public class RowsColsZero{

    void setMatrix(int[][] matrix){
	
	    int[] row = new int[matrix.length];
		int[] col = new int[matrix[0].length];

        for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
		      if(matrix[i][j]==0){
			       row[i]=1;
				   col[j]=1;
			  }
		   }
		}

		for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
		      if(row[i]==1||col[j]==1){
			       matrix[i][j]=0;
			  }
		   }
		}
	}
	
}