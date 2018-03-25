
import java.util.Scanner;
class MultiplicationTable{
	public static void main(String[] args){
		int i = 1;
		Scanner s = new Scanner(System.in);
		int n;
		n = s.nextInt();
		for(i=1;i<21;i++){
			System.out.println(i + " X " + n + " = " + i*n);
		}
	}
}
