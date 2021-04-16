/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Arrays;

public class Main {
    public static void fatore(int numero) {
        if (numero > 1) {
            int numero_fatorado = numero;
            System.out.println(numero);
            
            for (int i = 0; numero_fatorado > 1; i++) {
                int result = numero_fatorado / 2;
                numero_fatorado = result;
                System.out.println(result);
            }
        }
    }
    
	public static void main(String[] args) {
        fatore(50);
	}
}
