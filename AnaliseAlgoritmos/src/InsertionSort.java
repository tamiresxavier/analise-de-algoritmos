import java.util.List;

public class InsertionSort extends AlgoritmoDeOrdenacao {

	public void sort(List<Integer> array) {
		iniciar();
		trocaDeChaves=0;
		testeDeChaves=0;
		int n = array.size();
		for (int j = 1; j < n; j++) {
			int key = array.get(j);
			int i = j - 1;
			while ((i > -1) && (array.get(i) > key)) {
				array.set(i+1,array.get(i));
				i--;
				trocaDeChaves++;
				testeDeChaves++;
			}
			testeDeChaves++;			
			array.set(i+1,key);
			trocaDeChaves++;

		}
		finalizar();
	}
}