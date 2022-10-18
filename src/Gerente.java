
public class Gerente extends Funcionario {

	public Gerente(String nome, int matricula, float salario, String setor) {
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
		this.setor = setor;
	}
	
	//@Override
	public void calcularValeRefeicao(int diasTrabalhados)
	{
		this.valeRefeicao = diasTrabalhados * 40;
		System.out.printf("Vale = R$ %.2f\n",valeRefeicao);
	}
}
