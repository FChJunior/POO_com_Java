import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		/*Gerente g1 = new Gerente("Ricardo", 2222, 5000, "Administração");
		Analista a1 = new Analista("Tobia", 2424, 2500, "Administração");
		Estagiario e1 = new Estagiario("Esron", 1313, 1000, "Administração");
		
		g1.ponto();
		g1.anotar();
		g1.calcularValeRefeicao(20);
		
		a1.ponto();
		a1.anotar();
		a1.calcularValeRefeicao(20);
		
		e1.ponto();
		e1.anotar();
		e1.calcularValeRefeicao(20);*/
		
		Random n = new Random();
		System.out.println(n.nextInt(1,3));
		Triangulo l = new Triangulo();
		l.ehTriangulo();
		l.ehTriangulo();
		l.ehTriangulo();
		l.ehTriangulo();
		

	}

}
