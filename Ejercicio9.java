import java.util.Scanner;
public class Ejercicio9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba la altura del rectángulo: ");
		int alt = sc.nextInt();
		
		for(int i = 1; i <= alt; i++)
			System.out.print("*");
		System.out.println("");
		for(int i = 1; i <= alt; i++){
			System.out.print("*");
			for(int j = 1; j<=alt-2;j++)
				System.out.print(" ");
			System.out.println("*");
		}
		for(int i = 1; i <= alt; i++)
			System.out.print("*");
		System.out.println("");
		
	}
}
