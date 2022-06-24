
public class AutenticacaoUtil {

		// classe responsvel por aplicar as regras de negocio responsaveis pela autenticacao
	private int senha;
	
	public void setSenha(int senha) {			// metodo abstrato da Interface sobrescrito
		this.senha = senha;	
	}
	
	public boolean autentica(int senha) {		// metodo abstrato da Interface sobrescrito
		if (this.senha == senha) {
			return true;
		}
		return false;
	}
}
