
public abstract class Conta {					
	
	private static int totalDeContas;			
										
	protected double saldo;			
	private int agencia;					
	private int numero;
	private Cliente titular;
	
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
	
	public abstract void deposita(double valor);
	
	public boolean saca(double valor) {		
		
		if (this.saldo >= valor) {				
			this.saldo -= valor;				
			return true;						
		}
		return false;					
	}
		
	public boolean transfere(double valor, Conta conta) {
		
		if (this.saldo >= valor) { 
			this.saldo -= valor;	// mesmo que >>> this.saca(valor);
			conta.saldo += valor; 	// mesmo que >>> conta.deposita(valor);
			return true;
		}
		return false;
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
	
	public Cliente getTitular() {						
		return titular;						 		
	}
	public void setTitular(Cliente titular) { 	
		this.titular = titular;
	}
}


