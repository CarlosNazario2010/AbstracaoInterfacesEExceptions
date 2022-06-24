
public class Supervisor extends Funcionario implements SujeitoAutenticavel {
	
	private int senha;
	
	@Override
	public double getBonificacao() { 			// metodo abstrato da Classe sobrescrito
		return super.getSalario();
		
	}
		// OBS pode ser usada a regra utilizada em gerente e cliente para realizar a 
		// 		autenticacao e assim evitar a repeticao de codigo nas classes que
		//		acessam o sistema. Para fins didaticos, sera mantida a regra aqui
	
	@Override
	public void setSenha(int senha) {			// metodo abstrato da Interface sobrescrito
		this.senha = senha;	
	}
	
	@Override
	public boolean autentica(int senha) {		// metodo abstrato da Interface sobrescrito
		if (this.senha == senha) {
			return true;
		}
		return false;
	}
}

