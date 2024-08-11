import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a, b;
		int res;
		System.out.println("Alumno, Ingrese el primer número: ");
		a=sc.nextInt();
		System.out.println("Alumno, Ingrese el segundo número: ");
		b=sc.nextInt();
		res=a+b;
		System.out.println("La suma es: "+res);
	}

}
