
public class Gerente extends Funcionario implements SujeitoAutenticavel {
		// Gerente é filho de Funcionario e implementa Sujeito autenticavek
		// obs - No Java nao é possivel herdar mais de uma classe (heranca multipla),
		//			mas é possivel implementar varias interfaces

		// declara a variavel autenticador, do tipo AutenticacaoUtil - COMPOSICAO
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
		// mesmo delegando a tarefa de autentica, classe ainda deve implementar os metodos abstratos da interface
	@Override
	public void setSenha(int senha) {					// delega para a classe AutenticadorUtil		
		this.autenticador.setSenha(senha);				// a tarefa de realizar a regra de negocio
														// que autentica o cliente	
	}
	 
	@Override
	public boolean autentica(int senha) {		
		return this.autenticador.autentica(senha);
	}
			
	@Override
	public double getBonificacao() { 			// metodo abstrato da Classe sobrescrito
		return super.getSalario();
		
	}
}
