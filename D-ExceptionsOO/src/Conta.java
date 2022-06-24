
public class Conta {					
	
	private static int totalDeContas;									
	protected double saldo;			
	private int agencia;					
	private int numero;
	
	public Conta(int agencia, int numero) {					
		totalDeContas++;
		System.out.println("Total de contas criadas: " + totalDeContas);
		
		if (agencia <= 0 || numero <= 0) {
			System.out.println("Agencia precisa ser um numero inteiro positivo");
			return;
		}
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void saca(double valor) throws SaldoInsuficienteException {		
		if (this.saldo < valor) {				
			throw new SaldoInsuficienteException("Saldo em conta insuficiente");										
		}
		this.saldo -= valor;
	} 
	
	public void transfere(double valor, Conta conta) throws SaldoInsuficienteException {
		if (this.saldo < valor) { 
			throw new SaldoInsuficienteException("Saldo em conta insuficiente");
		}
		this.saldo -= valor;
		conta.saldo += valor;
	}
	
	public static int getTotalDeContas() {		
		return totalDeContas;				
	}
	
	public double getSaldo() {						
		return this.saldo;							
	}
	public int getNumero() {		
		return this.numero;
	}
	public void setNumero(int numero) { 	
		this.numero = numero;															
	}
	public int getAgencia() {		
		return this.agencia;
	}
	public void setAgencia(int agencia) {	
		this.agencia = agencia;				
	}
}


