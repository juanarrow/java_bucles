import java.util.Scanner;
public class Ejercicio5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Indica cuantos números quieres mostrar: ");
		int n = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		int cont = 1;
		System.out.print(n2+", ");
		while(cont < n){
			int temp = n1;
			n1 = n2;
			n2 = temp + n2;
			System.out.print(n2+", ");
			cont++;
		}
		
	}
}
