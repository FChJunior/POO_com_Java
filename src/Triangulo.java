import java.util.Scanner;

public class Triangulo {

	Scanner sc = new Scanner(System.in);
	public void ehTriangulo() {
		System.out.println("Inform os lados de um triangulo separados por espaço.");
		int lado1 = sc.nextInt();
		int lado2 = sc.nextInt();
		int lado3 = sc.nextInt();
		
		if((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado3 + lado2 > lado1)) {
			if(lado1 == lado2 && lado2 == lado3) {
				equilatero();
			}
			else if((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
				isosceles();
			}
			else {
				escaleno();
			}
		}
		else {
			System.out.println("Nao eh um trinagulo.");
		}
		//sc.close();
	}
	
	private void equilatero() {
		System.out.println("Eh um trinagulo equilatero");
	}
	private void isosceles() {
		System.out.println("Eh um trinagulo isosceles");
	}
	private void escaleno() {
		System.out.println("Eh um trinagulo escaleno");
	}
	
}
