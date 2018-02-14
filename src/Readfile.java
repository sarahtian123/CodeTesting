import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Readfile {
	
	
	private Scanner numberFile;
	public void openFile(){
		try{
			numberFile = new Scanner(new File("/Users/jiayitian1/Desktop/CodeTest/src/numbers"));
		}
		catch(Exception e){
			System.out.println("The file does not exist.");
		}
	}
	
	public void readFile(){
		while(numberFile.hasNext()){
			int a = numberFile.nextInt();
			System.out.println("\n "+ a+ " prime factors are: ");
			for (Integer result:primeFactors(a)){
				
				
							System.out.print(" "+ result +", ");
			
			}
	}
	}
	
	public void closeFile(){
		numberFile.close();
		
	}
	
	
	
	public static List<Integer> primeFactors(int num){
		
		
		List<Integer> fact = new ArrayList<Integer>();
		//finding the prime factors of given integers and return them as a list
		for (int i=2; i<=num; i++){
			while(num % i==0){
				fact.add(i);
				num /=i;
			}		
		}		
		
		return fact;
	}



	}

