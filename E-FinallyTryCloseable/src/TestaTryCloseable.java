
public class TestaTryCloseable {

	public static void main(String[] args) {
			
				// com a interface AutoCloseable o catch no try/catch é opcional
		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		}
		catch (IllegalStateException ex) {
			System.out.println("Erro de conexao");
		}
	}
}
