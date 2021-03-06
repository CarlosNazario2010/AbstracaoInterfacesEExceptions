
public class Teste {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente(4429, 12345);
		ContaPoupanca contaPoupanca = new ContaPoupanca(3240, 654321);
		
		contaCorrente.deposita(100);
		contaPoupanca.deposita(200);
		
		contaCorrente.transfere(10, contaPoupanca);
		
		System.out.println("Saldo contaCorrente: " + contaCorrente.getSaldo());
		System.out.println("Saldo contaPoupanca: " + contaPoupanca.getSaldo());
		
		contaCorrente.saca(10);		// taxa de saque == 1 real
		
		System.out.println("Saldo contaCorrente: " + contaCorrente.getSaldo());

		SeguroDeVida seguro = new SeguroDeVida(100);
		
				// taxa de imposto == ultimo parametro
		System.out.println(seguro.calculaImposto(100, 0.2)); 			
		System.out.println(contaCorrente.calculaImposto(contaCorrente.getSaldo(), 0.1));
	}
}
