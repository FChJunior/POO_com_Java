
public class Estagiario extends Funcionario{

	public Estagiario(String nome, int matricula, float salario, String setor) {
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
		this.setor = setor;
	}
	
	//@Override
	public void calcularValeRefeicao(int diasTrabalhados)
	{
		this.valeRefeicao = diasTrabalhados * 15;
		System.out.printf("Vale = R$ %.2f\n",valeRefeicao);
	}
}
