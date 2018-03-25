
import java.util.Scanner;
class Amicable{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int num1,num2;
		num1 = s.nextInt();
		num2 = s.nextInt();
		int num1Sum = 0, num2Sum = 0;
		for(int i=1;i<num2;i++){
			if(num2%i==0){
				num2Sum = num2Sum + i;
			}
		}
		for(int i=1;i<num1;i++){
			if(num1%i==0){
				num1Sum = num1Sum + i;
			}
		}
		if(num1==num2Sum && num2==num1Sum){
			System.out.println("They are amicable numbers");
		}
		else{
			System.out.println("They are not amicable numbers");
		}
	}
}
