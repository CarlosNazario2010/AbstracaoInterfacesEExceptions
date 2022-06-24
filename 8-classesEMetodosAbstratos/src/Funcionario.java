
	// classe abstrata só será usada para que suas filhas possam herdar seus atributos e metodos
	// nào pode ser usada para instanciar objetos da classe
public abstract class Funcionario {

	private String nome;			
	private String cpf;	
	private double salario;
				
		
		// metodo abstrato nao permite implementacao na classe abstrata
		// obriga as classes filhas a realmente implementarem o metodo
		// obs - para se implentar um metodo abstrato a classe precisa ser abstrata
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
