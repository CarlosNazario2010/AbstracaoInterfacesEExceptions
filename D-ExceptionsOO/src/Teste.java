
public class Teste {

	/*
	 *  	NOS METODOS COM (checked)
	 *  	ou se adiciona o throws na declaracao do metodo
	 *  	ou envolve o metodo com o try/catch
	 */
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(4429, 123456);	
		conta.deposita(1000);
		
		try {
			conta.saca(1001);
		} 
		catch (SaldoInsuficienteException ex) {
			ex.printStackTrace();
		}
		
		System.out.println(conta.getSaldo());
		
		Conta conta2 = new Conta(3240, 654321);
		conta2.deposita(1000);
		
		try {
			conta2.transfere(1001, conta);
		}
		catch(SaldoInsuficienteException ex) {
			ex.printStackTrace();;
		}
		
		System.out.println(conta.getSaldo());
		System.out.println(conta2.getSaldo());
	}
}
