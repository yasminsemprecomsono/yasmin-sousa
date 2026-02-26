
/**
 * 1)
 * O imposto está fixo em 10%, dificultando adaptação a novas regras.
 * 
 * Não há forma de incluir novos cálculos (ex: desconto) sem alterar o método.
 * 
 * Violação do princípio aberto/fechado.
 * 
 * Método com responsabilidade rígida e pouco extensível.
 */
public class CalculadoraDePreco {

	public static double calcular(double preco) {
		double resultado = preco;
		resultado = resultado + (preco * 0.10);
		return resultado;
	}

	public static void main(String[] args) {
		System.out.println(calcular(100));
	}
}
