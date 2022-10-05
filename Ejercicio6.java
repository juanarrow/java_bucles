import java.util.Scanner;
public class Ejercicio6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int n = sc.nextInt();
		int fact = n;
		for(int i = 1; i < n; i++)
			fact *=i;
		System.out.print("El factorial de "+n+" es: " + fact);
	}
}
