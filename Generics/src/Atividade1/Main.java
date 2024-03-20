package Atividade1;

public class Main {

	public static void main(String[] args) {

		 Produto p = new Produto("Sapato", 9988);
				
		 LProduto<Integer> integer = new LProduto<Integer>();
		 LProduto<String> string = new LProduto<String>();
		 LProduto<Produto> produto = new LProduto<Produto>();

         integer.add(Integer.valueOf(10));
         string.add(new String("Produto e Código do produto"));
         produto.add(p);

         System.out.printf("Integer Value :%d\n\n", integer.get());
         System.out.printf("String Value :%s\n", string.get());
         System.out.printf("Object Value :%s\n", produto.get());
         

	}

}
