// No cliente foi criado uma classe especifica que realiza a autenticacao, visto que
// ha repeticao de codigo nas classes supervisor e gerente para acessar o sistema
// Ambos os codigos funcionam e poderia ser implementado em todas as classes


			// implements indica que a Classe vai implementar a Interface
public class Cliente implements SujeitoAutenticavel {
	
	private AutenticacaoUtil autenticador;   			// COMPOSICAO
	
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();		// cliente recebe o autenticador no construtor
	}
	
	@Override
	public void setSenha(int senha) {					// delega para a classe AutenticadorUtil		
		this.autenticador.setSenha(senha);				// a tarefa de realizar a regra de negocio
														// que autentica o cliente	
	}
	 
	@Override
	public boolean autentica(int senha) {		
		return this.autenticador.autentica(senha);
	}
	
			// agora mesmo o cliente nao sendo um funcionario, ele pode ter acesso ao 
			// metodos devem ser sobrescritos devido a interface
}
