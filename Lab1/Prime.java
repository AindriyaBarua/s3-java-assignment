
import java.util.Scanner;
class Prime{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int num;
		int flag = 1;
		int flag1 =1;
		num = s.nextInt();
		if(num<10){
			System.out.println("Sorry, the number is less than 10.Enter a new number");
			num = s.nextInt();
		}
		for(int i=2;i<num/2;i++){
			if(num%i==0){
				flag = 0;
			}
		}
		if(flag == 0){
			System.out.println("It is not Prime");
		}
		int rev = 0;
		int n = num;
		while(n != 0){
			rev = rev*10+n%10;
			n = n/10;
		}
		if(rev == num){
			System.out.println("It is a palindrome");
		}
		for(int i=2;i<rev/2;i++){
			if(rev%i==0){
				flag1 = 0;		
			}
		}
		if(flag1 == 1){
			System.out.println("It is an emirp number");
		}
		else{
			System.out.println("It is not an emirp number");
		}	
	}
}
