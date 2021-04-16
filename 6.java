public class Main {
    public static void evenNumbers(int number) {
		int initialNumber = number;
		
		if (number % 2 != 0) {
		    initialNumber = number - 1;
		}
		
		for (int i = 0; i < 5; i++) {
		    int result = initialNumber + 2;
		    initialNumber = result;
		    System.out.println(result);
		}
	}
    
	public static void main(String[] args) {
		evenNumbers(5);
	}
}
