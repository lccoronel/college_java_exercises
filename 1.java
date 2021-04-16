/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
        int[] vetor1 = {12,32,54,6,8,89,64,64,6,10};
        int[] vetor2 = {12,32,54,6,8,89,64,64,6,10};
        
        int result_vetor[] = new int[10];

        for (int i=0; i<10; i++) {
            int sum_value = vetor1[i] + vetor2[i];
            result_vetor[i] = sum_value;
        }
        
        System.out.print(Arrays.toString(result_vetor));
	}
}
