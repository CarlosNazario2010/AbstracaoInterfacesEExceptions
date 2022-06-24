
		// AutoCloseable permite passar parametros pro try
public class Conexao implements AutoCloseable {

    public Conexao() {
        System.out.println("Abrindo conexao");
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException(); 		// unchecked exception
    }

	@Override
	public void close() {
        System.out.println("Fechando conexao");		
	}
}