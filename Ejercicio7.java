import java.util.Scanner;
public class Ejercicio7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba la altura de la pirámide: ");
		int alt = sc.nextInt();
		
		for(int i = 1; i <= alt; i++){
			for(int j=1; j<=alt-i;j++)
				System.out.print(" ");
			for(int j=1; j<=2*i-1;j++)
				System.out.print("*");
			System.out.println("");
		}
		
	}
}
