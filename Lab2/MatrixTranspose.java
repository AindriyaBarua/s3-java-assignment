
import java.util.Scanner;
class MatrixTranspose{
	private int n;
	private int[][] matrix;
	MatrixTranspose(int n){
		this.matrix = new int[n][n];
	}
	public void enterMatrix(){
		Scanner s = new Scanner(System.in);
		int m;
		for(int i=0;i<this.n;i++){
			for(int j=0;j<this.n;j++){
				m = s.nextInt();
				matrix[i][j] = m;
			}
		}
	}
	public void checkTranspose(){
		int flag = 1;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
			if(matrix[i][j] != matrix[j][i]){
				flag = 0;
				break;
			}	
			}
			
		}
		if(flag == 0){
			System.out.println("It is not a symmetric matrix");
		}
		else{
			System.out.println("It is symmetric matrix");
		}
	}
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		MatrixTranspose m = new MatrixTranspose(n);
		m.n = n;
		m.enterMatrix();
		m.checkTranspose();
	}
}
