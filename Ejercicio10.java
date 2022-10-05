import java.util.Scanner;
public class Ejercicio10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba un número: ");
		int n = sc.nextInt();
		int i = 2;
		boolean esprimo = true;
		while(esprimo && i <= n/2){
			if((n % i)==0)
				esprimo = false;
			i++;
		}
		if(esprimo)
			System.out.print("El número es primo");
		else
			System.out.print("El número no es primo");
		
	}
}
