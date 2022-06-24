
public class Teste {

	public static void main(String[] args) {

				// como Funcionario é uma classe abstrata nào é possivel
				// instanciar um funcionario diretamente
		// Funcionario funcionario = new Funcionario()

				// é possivel dar uma referencia Funcionario num objeto Gerente (classe filha)
				// mas nao instanciar um objeto funcionario diretamente
		Funcionario funcionario = new Gerente();
		
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
	}
}
