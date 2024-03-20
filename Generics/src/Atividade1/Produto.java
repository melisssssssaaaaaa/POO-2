package Atividade1;

public class Produto {
	
	private String nome;
	private int codigo;
	
	public Produto(String nome, int codigo) {
		setNome(nome);
		setCodigo(codigo);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [nome=");
		builder.append(nome);
		builder.append(", codigo=");
		builder.append(codigo);
		builder.append("]");
		return builder.toString();
	}
}

