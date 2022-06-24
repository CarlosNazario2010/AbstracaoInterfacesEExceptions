
public abstract class Conta {					// classe abstrata
	
	private static int totalDeContas;			// atributo estatico 
										
	protected double saldo;			
	private int agencia;						// atributos da instancia
	private int numero;
	private Cliente titular;
	
	public Conta(int agencia, int numero) {		// constutor da classe	
							
		totalDeContas++;
		System.out.println("Total de contas criadas: " + totalDeContas);
		
		if (agencia <= 0 || numero <= 0) {
			System.out.println("Agencia precisa ser um numero inteiro positivo");
			return;
		}
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public abstract void deposita(double valor);		// metodo abstrato
	
	public boolean saca(double valor) {					// metodo concreto
		if (this.saldo >= valor) {				
			this.saldo -= valor;				
			return true;						
		}
		return false;					
	}
	
	public boolean transfere(double valor, Conta conta) {
		
		if (this.saldo >= valor) { 
			this.saldo -= valor;	
			conta.saldo += valor; 	
			return true;
		}
		return false;
	}
	
	public static int getTotalDeContas() {			// getter estatico
		return totalDeContas;				
	}
	
	public double getSaldo() {						// getters e setters padrao dos		
		return this.saldo;							// atributos da classe
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
	
	public Cliente getTitular() {					// getter e setter do atributo que é			
		return titular;						 		// instancia em uma composicao
	}
	public void setTitular(Cliente titular) { 	
		this.titular = titular;
	}
}
