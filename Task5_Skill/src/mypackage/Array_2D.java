package mypackage;

public class Array_2D {

	public static void main(String[] args) {
		int[][] matrix = { {1, 2},{3, 4},{5, 6}};

	        System.out.println("2D Array: ");
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[i].length; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }

	}

}
