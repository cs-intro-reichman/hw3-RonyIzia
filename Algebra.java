//
public class Algebra {
	public static void main(String args[]) {
	    int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
	  
	    System.out.println(minus(a,b));  // a - b
 		System.out.println(times(a,b));  // a * b
   		System.out.println(pow(a,b));      // a ^ b
   		System.out.println(div(a,b));   // a / b  
   		System.out.println(mod(a,b));   // a % b  
   		System.out.println(sqrt(a));   // a ^ 0.5
	} 
	public static int plus(int a, int b) {
		return a + b;
	}
	public static int minus(int a, int b){
		return a - b;
	}
	public static int times(int a, int b) {
		return a * b;
	}
	public static int pow(int a, int b) {
		int result = 1;
		for (int i = 0; i < b; i++) {
			result = result * a;
		}
	return result;
	}
	public static int div(int a, int b){
		return a / b;
	}
    public static int mod(int a,int b){
	 return a % b;
	 }
	 public static double sqrt(int a){
	 return Math.sqrt(a);
	 
	 }




	
	 
}