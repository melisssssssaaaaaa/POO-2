package Atividade3;

public class Main {

public static void main(String[] args) {

		
		Pedidos<ProdutoTal> pedido = new Pedidos<ProdutoTal>();
		
		pedido.add(new ProdutoTal(2131, "Sapato", 1.500, null, null));
		pedido.add(new ProdutoTal(2506, "Apartamento", 120.000, null, null));
	
		System.out.println(pedido.mostrarListaProdutos());
	}

}
