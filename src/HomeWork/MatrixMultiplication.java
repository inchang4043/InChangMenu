

public class MatrixMultiplication {

	public static void main(String[] args) {
		int[][] arr1 = {
			    {1, 0, 2},
			    {-1, 3, 1}
			  };
			  
			  int[][] arr2 = {
			    {3, 1},
			    {2, 1},
			    {1, 0}
			  };
			  
			  final int ROW = arr1.length; // arr1�� �� ����
			  final int COL = arr2[0].length; // arr2�� �� ����
			  final int M2_ROW = arr2.length; // arr2�� �� ����
			  
			  int[][] m3 = new int[ROW][COL];
			  
			  //��İ� arr1 x arr2 �� ����� arr3�� ����
			  for(int i=0; i<ROW; i++)
			   for(int j=0; j<COL; j++)
			    for(int k=0; k<M2_ROW; k++)
			     m3[i][j] += arr1[i][k] * arr2[k][j];
			  
			  for(int i=0; i<ROW; i++){
			   for(int j=0; j<COL; j++){
			    System.out.printf("%3d", m3[i][j]);
			   }
			   System.out.println();
			  }
			 }
				}

