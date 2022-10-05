import java.util.Scanner;
public class Ejercicio3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca cuantos números quieres sumar: ");
		int n = sc.nextInt();
		int suma = 0;
		for(int i=1; i<=n;i++){
			suma+=i;
		}
		System.out.println("La suma de los "+n+" primeros números es: "+suma);
	}
}
