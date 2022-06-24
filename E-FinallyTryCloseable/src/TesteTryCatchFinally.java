
public class TesteTryCatchFinally {

	public static void main(String[] args) {
		
		Conexao conexao = null;			// conexao comeca com nulo
		
		try {
			conexao = new Conexao();	// instancia a conexao dentro do bloco try
			conexao.leDados();
//			conexao.fecha(); 			// no bloco try, em caso de exception, nao ocorre o fechamento 
		}
		catch (IllegalStateException ex) {
			System.out.println("Erro na conexao");
		}
		finally {						// finally sempre sera executado, com ou sem excessoes
			conexao.close();
		}
	}
}
