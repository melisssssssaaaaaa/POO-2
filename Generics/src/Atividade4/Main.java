package Atividade4;

public class Main {

	public static void main(String[] args) {


		VerificaChaveValor<String> verificaChaveValor = new VerificaChaveValor<>();
		verificaChaveValor.add("1024", "231321");
		verificaChaveValor.add("5678", "5678");
		verificaChaveValor.add("9988", "123123");
		
		
		System.out.print(verificaChaveValor.get("1024"));
		System.out.println("\n");
		System.out.print(verificaChaveValor.get("9988"));
	}

}
