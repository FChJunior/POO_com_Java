
public class Pessoa {

	private String nome;
	private int idade;
	private float altura;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return this.idade;
	}
	
	public Pessoa()
	{
		System.out.println("Indigente criado.");
	}
	public Pessoa(String nome, int idade, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		System.out.println("Pessoa criada: ");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Altura: " + this.altura);
		
	}
	
	private void falar(String frase)
	{
		System.out.println("A "+nome+" falou: "+frase);
	}
	private void falar() {
		System.out.println("A pessoa não fala.");
	}
	private void andar()
	{
		System.out.println("A "+ nome + " esta andando.");
	}

	public void acoes(int acao) {
	
		switch(acao) {
			case 1:
				falar();
			break;
			case 2: 
				andar();
				break;
		}
	}
	
	public void acoes(int acao,String frase) {
		switch(acao) {
		case 1:
			falar(frase);
		break;}
	}
}
