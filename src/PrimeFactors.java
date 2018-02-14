import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PrimeFactors {
	
	public static List<Integer> primeFactors(int num){
		
		
		List<Integer> fact = new ArrayList<Integer>();
		for (int i=2; i<=num; i++){
			while(num % i==0){
				fact.add(i);
				num /=i;
			}		
		}		
		return fact;
	}



	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		while (input.hasNext()){
			int a =input.nextInt();
			for (Integer result:primeFactors(a)){
				
				
				System.out.print(result +", ");
				
			}
		
		}
	
	
	
       
}

}
