
public class SistemaInterno {
	
	private int senha = 1234;
	
	// classe que recebe um sujeitoAutenticavel e realiza a verificacao da senha
	// permitindo ou nao acesso ao sistema
	
	public void autentica(SujeitoAutenticavel sujeitoAutenticavel) {		
		boolean autenticou = sujeitoAutenticavel.autentica(this.senha);
			// sujeitoAutenticavel é uma interface. Pode haver Polimorfismo
			// tanto atraves de heranca quanto atraves de interfaces
		
		if(autenticou == false) {
			System.out.println("Senha incorreta");
			return;
		}
		System.out.println("Acesso permitido");
	}
}
