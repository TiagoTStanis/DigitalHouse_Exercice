package Banco;

public class Cliente {
	private Integer numero, cpf, rg;
	private String sobrenome;
	private Conta conta;
	public Cliente() {
		
	}
	public Cliente(Integer numero, String sobrenome, Integer rg, Integer cpf, Conta conta) {
		this.numero = numero;
		this.sobrenome = sobrenome;
		this.rg = rg;
		this.cpf = cpf;
		this.conta = conta;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Integer getRg() {
		return rg;
	}
	public void setRg(Integer rg) {
		this.rg = rg;
	}
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	@Override
	public String toString() {
		return "Cliente [numero=" + numero + ", sobrenome=" + sobrenome + ", rg=" + rg + ", cpf=" + cpf + ", conta="
				+ conta + "]";
	}
}
