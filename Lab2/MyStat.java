
import java.util.Scanner;
class MyStat{
	int[] elements;
	int n;
	MyStat(int n){
	elements = new int[n];
	}
	public void enterElements(){
		Scanner s = new Scanner(System.in);
		for(int i=0;i<n;i++){
			elements[i] = s.nextInt();
		}
	}
	public void calculate(){
		double avg = 0;
		for(int i=0;i<n;i++){
			avg = avg + elements[i];
		}
		avg = avg/n;
		int c=0,c1=0,mode=elements[0];
		for(int i=0;i<n;i++){
			if(elements[i] == mode){
				c = c+1;
			}
		}
		for(int i=1;i<n;i++){
			for(int j=0;j<n;j++){
				if (elements[i] == elements[j]){
					c1 = c1+1;
				}
			}
			if(c1>c){
				c = c1;
				mode = elements[i];
				
			}
			c1 =0;
		}
		double var;
		double sum = 0;
		double diff;
		for(int i=0;i<n;i++){
			diff = Math.abs( avg - elements[i]);
			sum = sum + diff;
		}
		var = (sum*sum)/(n-1);
		double sd = 0;
		sd = Math.sqrt(var);
		System.out.println("Average:" + avg + " Standard Deviation:" + sd + " Variance:" + var + " Mode:" + mode);
	}
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		MyStat m = new MyStat(n);
		m.n = n;
		m.enterElements();
		m.calculate();

	}
}
