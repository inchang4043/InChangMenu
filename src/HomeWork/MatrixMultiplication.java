

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
			  
			  final int ROW = arr1.length; // arr1의 행 길이
			  final int COL = arr2[0].length; // arr2의 열 길이
			  final int M2_ROW = arr2.length; // arr2의 행 길이
			  
			  int[][] m3 = new int[ROW][COL];
			  
			  //행렬곱 arr1 x arr2 의 결과를 arr3에 저장
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

