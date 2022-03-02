import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InicializadorDeLista {
	private List<Integer> lista;

	public InicializadorDeLista(int tamanho) {
		lista = new ArrayList<Integer>();
		for (int i = 1; i <= tamanho; i++) {
			this.lista.add(i);
		}
	}

	public List<Integer> getListaOrdenada() {
		Collections.sort(lista);
		return lista;
	}

	public List<Integer> getListaInversamenteOrdenada() {
		Collections.sort(lista);
		Collections.reverse(lista);
		return lista;
	}

	public List<Integer> getListaAleatoria() {
		Collections.shuffle(lista);
		return lista;
	}

	public List<Integer> getListaQuaseOrdenada() {
		Collections.sort(lista);
		int numero = 1;
		int tamanho= lista.size();
		lista.removeAll(lista);
		for (int i = 1; i < tamanho/2; i++) {
			lista.add(numero);
			lista.add(numero+tamanho);
			numero+=1;
		}
		return lista;
	}

	public List<Integer> getLista() {
		return lista;
	}
}
