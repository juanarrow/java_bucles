import java.util.Scanner;
public class Ejercicio4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Indica cuantos números quieres introducir: ");
		int n = sc.nextInt();
		int suma = 0;
		int valor = 0;
		for(int i=1; i<=n;i++){
			System.out.print("Valor: ");
			valor = sc.nextInt();
			suma+=valor;
		}
		System.out.println("La media de los valores introducidos es: " + (suma/n));
	}
}
