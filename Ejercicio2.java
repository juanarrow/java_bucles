import java.util.Scanner;
public class Ejercicio2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca la tabla a mostrar (1 al 10): ");
		int tabla = sc.nextInt();
		for(int i=1; i<=10;i++){
			System.out.println(tabla+"x"+i+"="+(i*tabla));
		}
	}
}
