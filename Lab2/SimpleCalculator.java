
import java.util.Scanner;
class SimpleCalculator{
	int number, number2;
	String operation;
	SimpleCalculator(){
		this.number = 0;
		this.number2 = 0;
	}

	public void addInteger(){
		
		int sum = this.number + this.number2;
		System.out.println(sum);
	}
	public void subtractInteger(){
		int diff = this.number - this.number2;
		System.out.println(diff);
	}
	public void multiplyInteger(){
		int multiply = this.number * this.number2;
		System.out.println(multiply);
	}

	public void divideInteger(){
		int div = this.number / this.number2;
		System.out.println(div);

	}
	public void perfomrCalculation(){
		Scanner s = new Scanner(System.in);
		this.number = s.nextInt();
		this.operation = s.next();
		this.number2 = s.nextInt();
		char op = operation.charAt(0);
		switch(op){
			case '+':{
				addInteger();
				break;
			}
			case '-':{
				subtractInteger();
				break;
			}
			case '*':{
				multiplyInteger();
				break;
			}
			case '/':{
				divideInteger();
				break;
			}
			default:
				System.out.println("Invalid Operator");
			}
		}
	public static void main(String args[]){
		SimpleCalculator sc = new SimpleCalculator();
		sc.perfomrCalculation();
	}	
	

}
