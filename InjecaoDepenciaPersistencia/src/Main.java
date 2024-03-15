

public class Main {

	public static void main(String[] args) {


		Xml xml = new Xml();
		Json json = new Json();
		
		Aluno joaoVitor = new Aluno("alexandre", 1, "123.465.876-98", "20/08/2002", "tonon20@hotmail.com");
		Aluno alexandra = new Aluno("Alexandra", 123, "145.567.876-56", "29/08/1976", "alexandre@gmail.com.br");
		

		Persistencia persistencia = new Persistencia(xml);
		Persistencia persistencia2 = new Persistencia(json);
		
		System.out.println("Usando XML: \n"+persistencia.persistir(joaoVitor));
		System.out.println("Usando json: \n"+persistencia2.persistir(alexandra));
	}

}