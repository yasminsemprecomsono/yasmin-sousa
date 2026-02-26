/**
 * 4)
 * 
 * Múltiplas responsabilidades na mesma classe.
 * 
 * A classe Pedido cuida de:
 * 
 * Dados do cliente (nome, email).
 * 
 * Dados do produto (nome, preço).
 * 
 * Lógica de cálculo (total do pedido).
 * 
 * Apresentação (impressão no console).
 * 
 * Isso viola o Princípio da Responsabilidade Única (SRP).
 * 
 * 
 * Os atributos não pertencem todos ao mesmo “conceito”:
 * 
 * Cliente ≠ Produto ≠ Pedido.
 * 
 * Alterações em cliente ou produto impactam diretamente o pedido.
 * 
 * 
 * Não é possível reutilizar Cliente ou Produto em outro contexto.
 * 
 * Se um cliente fizer vários pedidos, os dados ficam duplicados.
 * 
 * Um produto não pode ser compartilhado entre pedidos.
 * 
 */
public class Pedido {

	private String nomeCliente;
	private String emailCliente;

	private String nomeProduto;
	private double precoUnitario;
	private int quantidade;

	public double calcularTotal() {
		return precoUnitario * quantidade;
	}

	public void imprimirResumo() {
		System.out.println("Cliente: " + nomeCliente);
		System.out.println("Email: " + emailCliente);
		System.out.println("Produto: " + nomeProduto);
		System.out.println("Preço unitário: " + precoUnitario);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Total: " + calcularTotal());
	}
}