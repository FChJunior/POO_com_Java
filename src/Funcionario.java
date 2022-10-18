
public class Funcionario {
	
	protected int matricula;
	protected float salario;
	protected float valeRefeicao;
	protected String setor;
	protected String nome;
	
	public int getMatricula()
	{
		return this.matricula;
	}
	public float getSalario() 
	{
		return this.salario;
	}
	public String getSetor()
	{
		return this.setor;
	}
	public String getNome() 
	{
		return this.nome;
	}

	public void ponto()
	{
		System.out.println(nome + " bateu o ponto. N° matricula: " + matricula);
	}
	public void anotar() 
	{
		System.out.println(nome + " está anotando....");
	}
	
	//@Virtual
	public void calcularValeRefeicao(int diasTrabalhados)
	{
		this.valeRefeicao = diasTrabalhados * 22.1f;
		System.out.printf("Vale = R$ %.2f\n",valeRefeicao);
	}
}
