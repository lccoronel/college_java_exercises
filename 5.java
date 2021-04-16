/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Arrays;

public class Main {
    public static void uppercaseVowels(String word) {
        
        for (int i = 0; i < word.length(); i++) {
            String letra = word.substring(i, i + 1);
            
            if (letra.intern() == "a"  || letra.intern() == "e" || letra.intern() == "i" || letra.intern() == "o" || letra.intern() == "u") {
                System.out.println(letra.toUpperCase());
            } else {
                System.out.println(letra.toLowerCase());
            }
            
        } 
    }
    
	public static void main(String[] args) {
        uppercaseVowels("Lucas");
	}
}
