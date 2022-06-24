
public class Teste {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setSalario(5000);
		
		Supervisor supervisor = new Supervisor();
		supervisor.setSalario(4000);
		
		Programador programador = new Programador();
		programador.setSalario(3000);
		
		System.out.println(gerente.getBonificacao());
		System.out.println(supervisor.getBonificacao());
		System.out.println(programador.getBonificacao());
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(supervisor);
		controle.registra(programador);
		
		System.out.println(controle.getSoma());
		
		SistemaInterno sistema = new SistemaInterno();
		
		Cliente cliente = new Cliente(); 	// cliente tambem pode ter acesso ao sistema
		
		cliente.setSenha(1234);
		gerente.setSenha(1234);
		supervisor.setSenha(4321);
		
				// programador nao implementa a interface SujeitoAutenticavel 
				// e nao possui posui o setter setSenha
		
											// senha sistema == 1234
		sistema.autentica(cliente);
		sistema.autentica(gerente);		
		sistema.autentica(supervisor);		// supervisor erra a senha
	}
}
