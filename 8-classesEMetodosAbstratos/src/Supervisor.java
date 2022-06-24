
public class Supervisor extends Funcionario {
	
			// metodo abstrato na classe Funcionario obriga a 
			// classe filha Supervisor a implementar o metodo
	public double getBonificacao() { 	 
		return super.getSalario() * 0.4;		
	}
}
