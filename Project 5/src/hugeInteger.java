/*Jason Hensley 
 *COP 3330
 * 
 * 
 * 8.16 (Huge Integer Class) Create a class HugeInteger which uses a 40-element array of digits to
store integers as large as 40 digits each. --Done

Provide methods parse , toString , add and subtract . 

Method parse should receive a String , extract each digit using method charAt and place the integer
equivalent of each digit into the integer array. 

For comparing HugeInteger objects, provide the following methods: isEqualTo, isNotEqualTo, isGreaterThan, 
isLessThan, isGreaterThanOrEqualTo and isLessThanOrEqualTo. 

Each of these is a predicate method that returns true if the relationship holds between the two HugeInteger 
objects and returns false if the relationship does not hold. Provide a predicate method isZero . If you 
feel ambitious, also provide methods multiply, divide and remainder. 

[Note: Primitive boolean values can be output as the word â€œtrueâ€� or the word â€œfalseâ€� with format specifier %b .]

*/
import java.util.Scanner; 

public class hugeInteger {
	public static void main(String[] args) {
		
		hugeInteger a = new hugeInteger();
		//String a ="5456";
		//HugeInteger b = new HugeInteger();//"40762591874655977070"
		
		
		
		//HugeInteger b = new HugeInteger();
		
		Scanner input=new Scanner(System.in); 
		System.out.println("Enter desired input up to 40 digits: ");
		
		a.parse();
		
		
		//String str=input.nextLine();
		a.parse();
		
		Scanner input2=new Scanner(System.in);
		System.out.println("Enter desired input up to 40 digits: ");
		
		hugeInteger b;
		//b.parse();
		//int a = Integer.parseInt(a);
		//int b = Integer.parseInt(b);
			
		//add(a.hugeInteger, b.hugeInteger);
		
		//System.out.println(a.toString());
		
		//Tests
		
//		System.out.println("String of a: " + a.toString()+"\n");
//		System.out.println(add(a, b));
//		System.out.println(subtract(a, b));
//		System.out.println(isEqualTo(a, b));
//		System.out.println(isGreaterThan(a, b));
//		System.out.println(isGreaterThanOrEqualTo(a, b));
//		System.out.println(isLessThan(a, b));
//		System.out.println(isLessThanOrEqualTo(a, b));
//		System.out.println(isNotEqualTo(a, b));
		
		
		System.out.println(a+"\n");
		//System.out.println(b+"\n");
		
		//System.out.println("String of a: " + b.toString());
	}
	public static int[] hugeInteger = new int[40];
	private static Scanner input;
	
	public static int parse(){
		
		input = new Scanner(System.in);
		String str = input.nextLine();
//		int t = 0;
//		System.out.print(str);
//		while(input.hasNextLine()) {
//			hugeInteger[t] = input.nextInt();
//			t++;
//		}
		for(int i=0; i<str.length(); i++){
			hugeInteger[39-i] = str.charAt(i) - '0';
		}
		//System.out.println();
		return 0;
	}
	
	//public int[] intArrayFromSrting() {
		
	//	return 0;
	//}

	public static int add(int[] a, int[] b){
		int[] array = new int[40];
		for(int i=0; i<40; i++){
			array[39-i] = a[39-i] + b[39-i];
			if(array[i]>9)
				array[39-i+1]++;
		}
			for(int i=0; i<40; i++){
				System.out.print(array[i]);
			}
		return 0;
	}
	public static int subtract(int[] a, int[] b){
		int[] array = new int[40];
		for(int i=0; i<40; i++){
			array[39-i] = a[39-i] - b[39-i];
			if(array[i]<0)
				array[39-i-1]--;
		}
			for(int i=0; i<40; i++){
				System.out.print(array[i]);
			}
		return 0;
	}

	public String toString(){
		boolean okToPrint = false;
		String str = "";
		System.err.println("String: ");
		for(int i=0; i<hugeInteger.length; i++) {
			if (hugeInteger[i] != 0)
				okToPrint = true;
			if (okToPrint) 
				str = str + hugeInteger[i];
		}
		okToPrint = false;
		System.err.println("Integer: ");
		for(int i=0; i<hugeInteger.length; i++) {
			if (hugeInteger[i] != 0)
				okToPrint = true;
			if (okToPrint) 
				System.out.print(hugeInteger[i]);
		}
		return str;
	}
	
	public static boolean isEqualTo(int[] a, int[] b) {
		for(int i=0; i<40; i++){
			if (a[i] != b[i])
			return false;
		}
		return true;
	}
	public static boolean isNotEqualTo(int[] a, int[] b){
		if(isEqualTo(a,b)){
			return false;
		}
		return true;
	}
	public static boolean isGreaterThan(int[] a, int[] b){
		if(isEqualTo(a,b))
			return false;
		for(int i=0; i<40; i++){
			if (a[i] < b[i])
			return false;
		}
		return true;
	}
	public static boolean isLessThan(int[] a, int[] b){
		if(isEqualTo(a,b))
			return false;
		for(int i=0; i<40; i++){
			if (a[i] > b[i])
			return false;
		}
		return true;
	}
	public static boolean isGreaterThanOrEqualTo(int[] a, int[] b){
		for(int i=0; i<40; i++){
			if (a[i] < b[i])
			return false;
		}
		return true;
		}
	public static boolean isLessThanOrEqualTo(int[] a, int[] b){
		for(int i=0; i<40; i++){
			if (a[i] > b[i])
			return false;
		}
		return true;
	}
	public static boolean isZero(int[] a, int[] b){
		for(int i=0; i<40; i++){
			if(a[i] == 0 || b[i] == 0) {
				return true;
			}
		}
		return false;
	}
}

