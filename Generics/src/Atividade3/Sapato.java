package Atividade3;
import java.util.Date;

	public class Sapato extends ProdutoTal{

		private String descricao;

		public Sapato(int idPedido, String nomeProduto, double valor, Date dataPedido, Date dataEntrega, String descricao) {
			super(idPedido, nomeProduto, valor, dataPedido, dataEntrega);
			setDescricao(descricao);
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

}
