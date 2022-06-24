
// Interface é basicamente uma "classe" abstrata que possui todos os 
// seus metodos abstratos. Uma especie de contrato que a classe que 
// implementa a intereface se obriga a assinar (ou seja, se obriga a 
// implementar os metodos abstratos

public abstract interface SujeitoAutenticavel {
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);

}
