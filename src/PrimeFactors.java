
public class PrimeFactors {

	public static void main(String[] args) throws Exception{
		
	// Reading numbers from the file "numbers", and print out the prime factors for each given integer, then close the file.
	
		Readfile r = new Readfile();
		r.openFile();
		r.readFile();
		r.closeFile();

		}
       
}


