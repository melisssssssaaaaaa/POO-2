package Atividade1;
public class LProduto<T> {
	
	private T t;

	public void add(T t) {
        this.t = t;
      }

      public T get() {
        return t;
      }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LProduto [t=");
		builder.append(t);
		builder.append("]");
		return builder.toString();
	}
 }