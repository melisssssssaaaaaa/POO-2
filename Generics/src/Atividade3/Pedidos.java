package Atividade3;

	import java.util.ArrayList;
	import java.util.List;

	public class Pedidos <T extends ProdutoTal>{
		
		List<T> listProdutos = new ArrayList<T>();

		
		public void add(T produtoX) {
			listProdutos.add(produtoX);
	    }

		
		public List<T> mostrarListaProdutos() {
			return listProdutos;
		}

}
