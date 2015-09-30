public class projectEuler2 {
	public static void main(String[] args) {
		
	int a = 1;
	int b = 2;
	int sum = 2;

		for(int c = a+b; c <= 4000000; c = a+b){
			
			if(c%2 == 0){ 
				sum = sum + c;
			}		
			
			a = b;
			b = c;
		}	
			
	System.out.println("Total sum of even numbers: "+sum);
	
		
	
	}
}