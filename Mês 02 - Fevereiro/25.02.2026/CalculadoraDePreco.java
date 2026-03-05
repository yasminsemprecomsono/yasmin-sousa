/**
 * 1)<br>
 * O imposto está fixo em 10%, dificultando adaptação a novas regras.<br>
 * 
 * Violação do princípio aberto/fechado.<br>
 * 
 * Método com responsabilidade rígida e pouco extensível.
 */

//Tipo de Manutenção: Preventiva
//O codigo segue certo porem, se o governo resolver muda a taxa pra algo diferente de 10% o codigo quebra
//sendo assim a mudança foi fazer o codigo poder fazer mudanças de taxa

public class CalculadoraDePreco {

	private double taxaDeImposto;

	public CalculadoraDePreco(double taxaDeImposto){
		this.taxaDeImposto = taxaDeImposto;
	}

	public double calcular(double preco){
		double imposto = preco * this.taxaDeImposto;
		return preco + imposto;
	}

	public static void main(String[] args) {
		CalculadoraDePreco cal1 = new CalculadoraDePreco(0.10);
		System.out.println("Taxa de 10%: "+cal1.calcular(100));

		CalculadoraDePreco cal2 = new CalculadoraDePreco(0.20);
		System.out.println("Taxa de 20%: "+cal2.calcular(100));
		//teste

	}
}
