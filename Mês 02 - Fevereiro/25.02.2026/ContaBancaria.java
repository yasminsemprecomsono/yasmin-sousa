
/**
 * 2)
 * Os atributos titular e saldo não estão encapsulados, violando o encapsulamento.
 * 
 * Qualquer classe pode alterar o saldo diretamente (conta.saldo = -1000).
 * 
 * Não há validação para valores negativos em depositar e sacar.
 * 
 * A classe não protege seus invariantes (ex: saldo não deveria ser negativo).
 */
public class ContaBancaria {

	String titular;
	double saldo;

	public void depositar(double valor) {
		saldo += valor;
	}

	public void sacar(double valor) {
		saldo -= valor;
	}
}