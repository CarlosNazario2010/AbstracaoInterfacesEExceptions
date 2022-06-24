
public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int numero) {					
		super(agencia, numero);		
	}
	
			// metodo concreto sobrescrito de uum metodo concreto da classe mae
	@Override								
	public boolean saca(double valor) {											
		double valorASacar = valor + 1;		
		return super.saca(valorASacar);
											
	}
		
			// metodo concreto sobrescrito de um metodo abstrato da classe mae
	@Override
	public void deposita(double valor) {		
		super.saldo += valor;	
	}
}
	