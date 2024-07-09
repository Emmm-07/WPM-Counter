import java.util.concurrent.TimeUnit;
import java.util.Arrays;
import java.util.Random;	
import java.util.Scanner;
import java.time.LocalTime;
import javax.swing.JOptionPane;
public class Main {

	static String [] words = {"hello","dog","mouse","pretentious","window","highfalutin","eclipse","equinox","baggage","rendezvous","Scanner","System","import","JOptionPane","LocalTime","BufferedReader"};
	
	public static void main(String[] args) throws Exception{
		System.out.println("Starts in...");
		TimeUnit.SECONDS.sleep(1);				//Should throw an exception to work
		
		System.out.println("3");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("2");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("1");
		TimeUnit.SECONDS.sleep(1);
		
		Random rand = new Random();
		
		
		String target = "";
		for (int x =0;x<10;x++) {
			int i = rand.nextInt(words.length-1);							//generates random number with the range of 9
//			System.out.print(words[i]+" ");
			target+=words[i]+" ";
		}	

		System.out.println(target);
		System.out.println();
		
		double timeStart = LocalTime.now().toNanoOfDay();      //time from epoch in nano seconds
		Scanner sc= new Scanner(System.in);
		String typedWords=sc.nextLine();
		double timeEnd = LocalTime.now().toNanoOfDay();
		double elapsedTime = (timeEnd-timeStart)/1000000000;      // divide by 1x10^9 to convert to seconds
		
		System.out.println();
		String[] targetArr = target.split(" ");
		String[] typedWordsArr = typedWords.split(" ");
		Boolean isSame = true;
		for(int i=0;i<targetArr.length;i++) {
			if(!targetArr[i].equals(typedWordsArr[i])) {
				System.out.print("You got it wrong in this part: ");
				System.out.println(typedWordsArr[i]);
				isSame = false;
				break;
			}
		}
		
		if(isSame) {
			System.out.println("\nIt took you "+ elapsedTime+" seconds!");
			
																		//WPM formula: (number of characters / 5) / Time Elapsed in Minutes
			int numChar = typedWords.length();
			double elapsedTimeMinute = elapsedTime/60;
			int wpm = (int)((numChar/5)/elapsedTimeMinute);
	//		new GUI(wpm);
			System.out.println("Your WPM is: "+wpm);
		}else {
			
			System.out.println("Make sure to follow the spaces, uppercases, and lowercases");
		}
	}

}
//class GUI{l
//	GUI(int x){
//		JOptionPane.showConfirmDialog(null, "Are you done?");
//		JOptionPane.showMessageDialog(null, "Your WPM is: "+x);
//	}
//}
