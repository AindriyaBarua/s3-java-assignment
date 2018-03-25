
import java.util.Scanner;
class AverageSpeed{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter distance");
		double distKm = s.nextInt();
		double distMiles;
		distMiles = distKm/1.61;
		double timeSec,timeMin,secs;
		System.out.println("Enter minutes");
		timeMin = s.nextInt();
		System.out.println("Enter seconds");
		timeSec = s.nextInt();
		secs = timeMin * 60 + timeSec;
		double avgTimePerMile ;
		avgTimePerMile = secs/distMiles;
		System.out.println(avgTimePerMile + "s/mile");
		double avgSpeed ;
		avgSpeed = distMiles/(secs/(60*60));
		System.out.println("Average speed is " + avgSpeed + "miles/hr");

	}
}
