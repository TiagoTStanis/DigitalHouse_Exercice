package Banco;

public class ContaCorrente extends Conta{
	private Double limiteChequeEspecial;
	public ContaCorrente() {
		super();
	}
	public ContaCorrente(Double limiteChequeEspecial) {
		super();
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	public Double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}
	
	public void setLimiteChequeEspecial(Double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	@Override
	public void sacar(double valor) {
		double limite = getSaldo() - valor;
		
		if((limite + limiteChequeEspecial) >= 0) {
			super.sacar(valor);
			if(limite < 0) {
				limiteChequeEspecial = limiteChequeEspecial - limite;
			}			
		}else {
			System.out.println("Valor superou seu saldo disponível!");
		}
	}
	
	public void depositarCheques(Cheque cheque) {
		depositar(cheque.getValor());
	}
}