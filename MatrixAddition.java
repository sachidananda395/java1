import java.util.Scanner; 
public class MatrixAddition {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]); 
	int[][] matrix1 = new int[N][N];
	int[][] matrix2 = new int[N][N];
        Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i< N; i++) {
            for (int j = 0; j < N; j++) {
                matrix1[i][j] = scanner.nextInt();}}
	System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i< N; i++) {
            for (int j = 0; j < N; j++) {
                matrix2[i][j] = scanner.nextInt();}}
	int[][] sumMatrix = new int[N][N]; //Create new matrix to store the sum                 	
for (int i = 0; i< N; i++) {
            for (int j = 0; j < N; j++) {
		sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j]; }    }

       
	System.out.println("The sum of the two matrices is:");
            for (int i = 0; i< N; i++) {
            	for (int j = 0; j < N; j++) {
		   System.out.print(sumMatrix[i][j] + "   ");
            	}
		System.out.println();
        }
    }
}

