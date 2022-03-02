import java.util.List;

public class SelectionSort extends AlgoritmoDeOrdenacao {

	public void sort(List<Integer> lista) {
		iniciar();
		trocaDeChaves=0;
		testeDeChaves=0;
		for (int i = 0; i < lista.size() - 1; i++) {
			int index = i;
			for (int j = i + 1; j < lista.size(); j++) {
				testeDeChaves++;
				if (lista.get(j) < lista.get(index)) {
					index = j;
				}
			}
			trocaDeChaves+=2;
			int menor = lista.get(index);
			lista.set(index, lista.get(i));
			lista.set(i, menor);

		}
		finalizar();
	}
}