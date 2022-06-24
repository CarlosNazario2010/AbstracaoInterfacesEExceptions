
public class Programador extends Funcionario{
	
	public double getBonificacao() { 	 
		return super.getSalario() * 0.2;		
	}
}

// Hierarquia de classes
// Funcionario >>>> Programador